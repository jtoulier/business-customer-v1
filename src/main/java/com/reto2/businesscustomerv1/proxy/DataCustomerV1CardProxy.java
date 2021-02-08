package com.reto2.businesscustomerv1.proxy;

import com.reto2.businesscustomerv1.proxy.dto.response.CardResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "data-customer-v1-card", url = "${data-customer-v1.url}")
public interface DataCustomerV1CardProxy {
    @GetMapping("/card/{card-number}")
    CardResponse findByCardNumber(@PathVariable("card-number") String cardNumber);
}
