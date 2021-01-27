package dev.perfectbogus.msscbrewery.services;

import dev.perfectbogus.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
