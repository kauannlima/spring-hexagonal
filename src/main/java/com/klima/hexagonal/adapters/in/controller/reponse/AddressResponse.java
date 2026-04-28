package com.klima.hexagonal.adapters.in.controller.reponse;

import com.klima.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
