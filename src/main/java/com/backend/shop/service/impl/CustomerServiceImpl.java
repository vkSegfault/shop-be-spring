package com.backend.shop.service.impl;

import com.backend.shop.dto.CustomerDto;
import com.backend.shop.entity.Customer;
import com.backend.shop.mapper.CustomerMapper;
import com.backend.shop.repository.CustomerRepository;
import com.backend.shop.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {

        Customer customer = CustomerMapper.mapToCustomer(customerDto);
        Customer savedCustomer = customerRepository.save(customer);

        return CustomerMapper.mapToCustomerDto( savedCustomer );
    }
}
