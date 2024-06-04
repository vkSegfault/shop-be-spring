package com.backend.shop.mapper;

import com.backend.shop.dto.CustomerDto;
import com.backend.shop.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer) {

        return new CustomerDto(
                customer.getId(),
                customer.getEmail(),
                customer.getPassword(),
                customer.getFirstName(),
                customer.getLastName()
        );
    }

    public static Customer mapToCustomer(CustomerDto customerDto) {

        return new Customer(
                customerDto.getId(),
                customerDto.getEmail(),
                customerDto.getPassword(),
                customerDto.getFirstName(),
                customerDto.getLastName()
        );
    }
}
