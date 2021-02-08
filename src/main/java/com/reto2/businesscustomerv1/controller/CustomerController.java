package com.reto2.businesscustomerv1.controller;

import com.reto2.businesscustomerv1.dto.response.CustomerBasicInfoResponse;
import com.reto2.businesscustomerv1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-customer-v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{card-number}/basic-info")
    public ResponseEntity<CustomerBasicInfoResponse> getCustomerBasicInfo(
            @PathVariable("card-number") String cardNumber
    ) {
        return new ResponseEntity<>(customerService.getCustomerBasicInfo(cardNumber), HttpStatus.OK);
    }
}
