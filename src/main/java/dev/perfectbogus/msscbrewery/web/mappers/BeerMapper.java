package dev.perfectbogus.msscbrewery.web.mappers;

import dev.perfectbogus.msscbrewery.domain.Beer;
import dev.perfectbogus.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface  BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
