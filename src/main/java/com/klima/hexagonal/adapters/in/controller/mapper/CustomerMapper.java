package com.klima.hexagonal.adapters.in.controller.mapper;

import com.klima.hexagonal.adapters.in.controller.reponse.CustomerResponse;
import com.klima.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.klima.hexagonal.application.core.domain.Customer;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore  = true)
    @Mapping(target = "address", ignore  = true)
    @Mapping(target = "validCpf", ignore  = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
