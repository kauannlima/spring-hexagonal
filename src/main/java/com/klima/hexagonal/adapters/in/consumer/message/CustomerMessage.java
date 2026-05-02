package com.klima.hexagonal.adapters.in.consumer.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {

    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    @JsonProperty("isValidCpf")
    private Boolean validCpf;
}
