package dev.perfectbogus.msscbrewery.services;

import dev.perfectbogus.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}