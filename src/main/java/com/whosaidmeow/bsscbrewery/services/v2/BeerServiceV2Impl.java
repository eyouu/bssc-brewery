package com.whosaidmeow.bsscbrewery.services.v2;

import com.whosaidmeow.bsscbrewery.web.model.v2.BeerDTOV2;
import com.whosaidmeow.bsscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDTOV2 getBeerById(UUID beerId) {
        return BeerDTOV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }

    @Override
    public BeerDTOV2 save(BeerDTOV2 beerDTO) {
        return BeerDTOV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID beerId, BeerDTOV2 beerDTO) {
        // empty
    }

    @Override
    public void delete(UUID beerId) {
        log.debug("Deleting beer with id: {}", beerId);
    }
}
