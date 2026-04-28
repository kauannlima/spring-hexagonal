package com.klima.hexagonal.adapters.in.controller.reponse;

import com.klima.hexagonal.adapters.out.client.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
