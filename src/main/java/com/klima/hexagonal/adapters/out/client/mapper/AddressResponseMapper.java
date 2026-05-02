package com.klima.hexagonal.adapters.out.client.mapper;

import com.klima.hexagonal.adapters.out.client.response.AddressResponse;
import com.klima.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
