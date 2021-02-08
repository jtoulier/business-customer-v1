package com.reto2.businesscustomerv1.service;

import com.reto2.businesscustomerv1.dto.response.CustomerBasicInfoResponse;

public interface CustomerService {
    CustomerBasicInfoResponse getCustomerBasicInfo(String cardNumber);
}
