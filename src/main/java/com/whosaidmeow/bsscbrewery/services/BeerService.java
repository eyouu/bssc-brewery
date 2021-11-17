package com.whosaidmeow.bsscbrewery.services;

import com.whosaidmeow.bsscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

    BeerDTO save(BeerDTO beerDTO);

    void update(UUID beerId, BeerDTO beerDTO);

    void delete(UUID beerId);
}
