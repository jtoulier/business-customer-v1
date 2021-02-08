package com.reto2.businesscustomerv1.service.impl;

import com.reto2.businesscustomerv1.proxy.DataCustomerV1CardProxy;
import com.reto2.businesscustomerv1.proxy.dto.response.CardResponse;
import com.reto2.businesscustomerv1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private DataCustomerV1CardProxy dataCustomerV1CardProxy;

    @Override
    public Boolean validateCard(String cardNumber, String internetPassword) {
        CardResponse cardResponse = dataCustomerV1CardProxy.findByCardNumber(cardNumber);
        Boolean cardValidated;

        if (cardResponse == null) {
            cardValidated = false;
        }
        else {
            cardValidated = cardResponse.getInternetPassword().equals(internetPassword);
        }

        return cardValidated;
    }
}
