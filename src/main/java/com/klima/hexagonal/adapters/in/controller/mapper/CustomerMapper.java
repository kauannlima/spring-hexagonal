package com.klima.hexagonal.adapters.in.controller.mapper;

import com.klima.hexagonal.adapters.in.controller.reponse.CustomerResponse;
import com.klima.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.klima.hexagonal.application.core.domain.Customer;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
public interface CustomerMapper {

    @Mapping(target = "id", ignore  = true)
    @Mapping(target = "address", ignore  = true)
    @Mapping(target = "isValidCpf", ignore  = true)
    Customer toCustomer(@Valid @RequestBody CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
