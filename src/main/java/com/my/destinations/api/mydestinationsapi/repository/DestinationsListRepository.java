package com.my.destinations.api.mydestinationsapi.repository;

import java.util.List;
import java.util.Optional;

import com.my.destinations.api.mydestinationsapi.model.DestinationsList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface DestinationsListRepository extends CrudRepository<DestinationsList, Long> {
    @RestResource
    <S extends DestinationsList>S save(S destinationsList);

    @RestResource
    List<DestinationsList> findAll();

    @RestResource
    Optional<DestinationsList> findById(Long id);

    @RestResource
    void deleteById(Long id);
}
