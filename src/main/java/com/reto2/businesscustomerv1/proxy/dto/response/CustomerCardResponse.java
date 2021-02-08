package com.reto2.businesscustomerv1.proxy.dto.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCardResponse {
    private String cardNumber;
    private String cic;
}
