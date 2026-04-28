package com.klima.hexagonal.adapters.out.repository.mapper;

import com.klima.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.klima.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
