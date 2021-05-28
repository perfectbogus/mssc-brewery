package dev.perfectbogus.msscbrewery.services;

import dev.perfectbogus.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jose")
                .build();
    }

    @Override
    public CustomerDto savedNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // todo: implement
        log.debug("updating...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting...");
    }
}
