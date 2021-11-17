package com.whosaidmeow.bsscbrewery.services.v2;

import com.whosaidmeow.bsscbrewery.web.model.v2.BeerDTOV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDTOV2 getBeerById(UUID beerId);

    BeerDTOV2 save(BeerDTOV2 beerDTO);

    void update(UUID beerId, BeerDTOV2 beerDTO);

    void delete(UUID beerId);
}
