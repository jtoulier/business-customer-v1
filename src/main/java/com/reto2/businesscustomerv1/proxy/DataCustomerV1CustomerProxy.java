package com.reto2.businesscustomerv1.proxy;

import com.reto2.businesscustomerv1.proxy.dto.response.CustomerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "data-customer-v1-customer", url = "${data-customer-v1.url}")
public interface DataCustomerV1CustomerProxy {
    @GetMapping("/customer/{cic}")
    CustomerResponse findByCic(@PathVariable("cic") String cic);
}
