package com.marcos.vinicio.hexagonal.application.ports.out;

import com.marcos.vinicio.hexagonal.application.core.domain.Custumer;

public interface InsertCustomerOutputPort {
    void insert(Custumer custumer);
}
