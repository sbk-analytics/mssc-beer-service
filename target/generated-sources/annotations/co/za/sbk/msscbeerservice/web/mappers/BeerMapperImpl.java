package co.za.sbk.msscbeerservice.web.mappers;

import co.za.sbk.msscbeerservice.domain.Beer;
import co.za.sbk.msscbeerservice.web.model.BeerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-04T16:41:17+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
