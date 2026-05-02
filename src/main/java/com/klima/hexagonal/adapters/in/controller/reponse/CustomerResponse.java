package com.klima.hexagonal.adapters.in.controller.reponse;

import com.klima.hexagonal.adapters.out.client.response.AddressResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    @JsonProperty("isValidCpf")
    private Boolean validCpf;
}
