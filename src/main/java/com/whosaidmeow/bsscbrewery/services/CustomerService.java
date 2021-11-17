package com.whosaidmeow.bsscbrewery.services;

import com.whosaidmeow.bsscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID id);

    CustomerDTO save(CustomerDTO customerDTO);

    void update(UUID customerId, CustomerDTO customerDTO);

    void delete(UUID customerId);
}
