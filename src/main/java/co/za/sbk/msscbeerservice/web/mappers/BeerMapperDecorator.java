package co.za.sbk.msscbeerservice.web.mappers;

import co.za.sbk.msscbeerservice.domain.Beer;
import co.za.sbk.msscbeerservice.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Thato Seboko on 2021/02/04
 */
public abstract class BeerMapperDecorator implements BeerMapper {
    private BeerMapper mapper;

    @Autowired
    public void setMapper(BeerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        return mapper.beerToBeerDto(beer);
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        return mapper.beerDtoToBeer(beerDto);
    }
}