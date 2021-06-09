package dev.perfectbogus.msscbrewery.web.mappers;

import dev.perfectbogus.msscbrewery.domain.Customer;
import dev.perfectbogus.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
    
}
