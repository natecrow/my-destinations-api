package com.my.destinations.api.mydestinationsapi.repository;

import java.util.List;
import java.util.Optional;

import com.my.destinations.api.mydestinationsapi.model.Destination;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface DestinationRepository extends CrudRepository<Destination, Long> {
    @RestResource
    <S extends Destination>S save(S destination);

    @RestResource
    List<Destination> findAll();

    @RestResource
    Optional<Destination> findById(Long id);

    @RestResource
    void deleteById(Long id);
}
