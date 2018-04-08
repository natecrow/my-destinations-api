package com.my.destinations.api.mydestinationsapi.configuration;

import com.my.destinations.api.mydestinationsapi.model.Destination;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(Destination.class);
  }
}
