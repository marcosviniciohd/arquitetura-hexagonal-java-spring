package com.marcos.vinicio.hexagonal.application.ports.out;

import com.marcos.vinicio.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
