package com.klima.hexagonal.application.ports.out;

import com.klima.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {



    Optional<Customer> find(String id);
}
