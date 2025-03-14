package com.marcos.vinicio.hexagonal.adapters.out.client.mapper;

import com.marcos.vinicio.hexagonal.adapters.out.client.response.AddressResponse;
import com.marcos.vinicio.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
