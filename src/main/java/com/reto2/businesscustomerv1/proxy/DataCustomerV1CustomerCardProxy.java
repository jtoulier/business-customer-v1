package com.reto2.businesscustomerv1.proxy;

import com.reto2.businesscustomerv1.proxy.dto.response.CustomerCardResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "data-customer-v1-customer-card", url = "${data-customer-v1.url}")
public interface DataCustomerV1CustomerCardProxy {
    @GetMapping("/customer-card/{card-number}")
    CustomerCardResponse findByCardNumber(@PathVariable("card-number") String cardNumber);
}
