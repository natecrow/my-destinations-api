package com.my.destinations.api.mydestinationsapi.repository;

import com.my.destinations.api.mydestinationsapi.model.Destination;

import org.springframework.data.repository.CrudRepository;

public interface DestinationRepository extends CrudRepository<Destination, Long> {
}
