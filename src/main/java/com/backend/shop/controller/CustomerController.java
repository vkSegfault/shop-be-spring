package com.backend.shop.controller;

import com.backend.shop.dto.CustomerDto;
import com.backend.shop.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.createCustomer( customerDto );
        return new ResponseEntity<CustomerDto>(savedCustomer, HttpStatus.CREATED);
    }
}
