package com.whosaidmeow.bsscbrewery.services;

import com.whosaidmeow.bsscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDTO save(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID beerId, BeerDTO beerDTO) {
        // empty
    }

    @Override
    public void delete(UUID beerId) {
        log.debug("Deleting beer with id: {}", beerId);
    }
}
