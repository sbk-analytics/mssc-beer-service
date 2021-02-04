package co.za.sbk.msscbeerservice.services;

import co.za.sbk.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateById(UUID beerId, BeerDto beerDto);
}
