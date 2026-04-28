package com.klima.hexagonal.application.ports.out;

import com.klima.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
