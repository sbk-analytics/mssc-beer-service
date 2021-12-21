package co.za.sbk.msscbeerservice.web.mappers;

import co.za.sbk.msscbeerservice.domain.Beer;
import co.za.sbk.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    
    BeerDto beerToBeerDto(Beer beer);
    
    Beer beerDtoToBeer(BeerDto beerDto);
}
