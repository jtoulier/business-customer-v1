package com.reto2.businesscustomerv1.service.impl;

import com.reto2.businesscustomerv1.dto.response.CustomerBasicInfoResponse;
import com.reto2.businesscustomerv1.proxy.DataCustomerV1CustomerCardProxy;
import com.reto2.businesscustomerv1.proxy.DataCustomerV1CustomerProxy;
import com.reto2.businesscustomerv1.proxy.dto.response.CustomerCardResponse;
import com.reto2.businesscustomerv1.proxy.dto.response.CustomerResponse;
import com.reto2.businesscustomerv1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private DataCustomerV1CustomerCardProxy dataCustomerV1CustomerCardProxy;

    @Autowired
    private DataCustomerV1CustomerProxy dataCustomerV1CustomerProxy;

    @Override
    public CustomerBasicInfoResponse getCustomerBasicInfo(String cardNumber) {
        CustomerBasicInfoResponse customerBasicInfoResponse = new CustomerBasicInfoResponse();

        // obtener el CustomerCard
        CustomerCardResponse customerCardResponse = dataCustomerV1CustomerCardProxy.findByCardNumber(cardNumber);

        if (customerCardResponse != null) {
            String cic = customerCardResponse.getCic();

            // obtener el Customer
            CustomerResponse customerResponse = dataCustomerV1CustomerProxy.findByCic(cic);

            // preparar la respuesta
            customerBasicInfoResponse.setCardNumber(customerCardResponse.getCardNumber());
            customerBasicInfoResponse.setCic(cic);
            customerBasicInfoResponse.setDni(customerResponse.getDni());
            customerBasicInfoResponse.setFirstSurname(customerResponse.getFirstSurname());
            customerBasicInfoResponse.setSecondSurname(customerResponse.getSecondSurname());
            customerBasicInfoResponse.setGivenName(customerResponse.getGivenName());
        }

        return customerBasicInfoResponse;
    }
}
