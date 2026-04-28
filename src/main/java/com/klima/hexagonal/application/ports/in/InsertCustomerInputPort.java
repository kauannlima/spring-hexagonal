package com.klima.hexagonal.application.ports.in;

import com.klima.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
