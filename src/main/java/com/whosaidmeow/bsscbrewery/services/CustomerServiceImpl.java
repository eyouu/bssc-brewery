package com.whosaidmeow.bsscbrewery.services;

import com.whosaidmeow.bsscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder()
                .id(id)
                .name("Johan")
                .build();
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID customerId, CustomerDTO customerDTO) {
        log.debug("Updating customer with id: {}", customerDTO);
    }

    @Override
    public void delete(UUID customerId) {
        log.debug("Deleting customer with id: {}", customerId);
    }
}
