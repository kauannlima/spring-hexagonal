package com.klima.hexagonal.adapters.out.client.mapper;

import com.klima.hexagonal.adapters.out.client.response.AddressResponse;
import com.klima.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
