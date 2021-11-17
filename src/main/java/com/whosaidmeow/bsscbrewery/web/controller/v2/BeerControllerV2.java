package com.whosaidmeow.bsscbrewery.web.controller.v2;

import com.whosaidmeow.bsscbrewery.services.v2.BeerServiceV2;
import com.whosaidmeow.bsscbrewery.web.model.v2.BeerDTOV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerServiceV2;

    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTOV2> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody BeerDTOV2 beerDTO) {
        BeerDTOV2 saved = beerServiceV2.save(beerDTO);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/beer/" + saved.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(UUID beerId, @RequestBody BeerDTOV2 beerDTO) {
        beerServiceV2.update(beerId, beerDTO);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID beerId) {
        beerServiceV2.delete(beerId);
    }
}
