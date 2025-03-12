package com.marcos.vinicio.hexagonal.application.core.usecase;

import com.marcos.vinicio.hexagonal.application.core.domain.Address;
import com.marcos.vinicio.hexagonal.application.core.domain.Custumer;
import com.marcos.vinicio.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.marcos.vinicio.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustumerUseCase {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustumerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort
    )
    {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Custumer custumer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustomerOutputPort.insert(custumer);
    }
}
