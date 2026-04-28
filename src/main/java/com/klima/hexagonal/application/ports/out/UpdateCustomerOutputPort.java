package com.klima.hexagonal.application.ports.out;

import com.klima.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
