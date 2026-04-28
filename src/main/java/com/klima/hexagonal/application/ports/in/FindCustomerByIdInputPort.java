package com.klima.hexagonal.application.ports.in;

import com.klima.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find( String id);
}
