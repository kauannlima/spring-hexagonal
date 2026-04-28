package com.klima.hexagonal.application.ports.in;

import com.klima.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
