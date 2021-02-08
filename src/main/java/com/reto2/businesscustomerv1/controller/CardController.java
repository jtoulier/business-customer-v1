package com.reto2.businesscustomerv1.controller;

import com.reto2.businesscustomerv1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-customer-v1")
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping("/card/{card-number}/{internet-password}")
    public ResponseEntity<Boolean> validateCard(
            @PathVariable("card-number") String cardNumber,
            @PathVariable("internet-password") String internetPassword
    ) {
        return new ResponseEntity<>(cardService.validateCard(cardNumber, internetPassword), HttpStatus.OK);
    }
}
