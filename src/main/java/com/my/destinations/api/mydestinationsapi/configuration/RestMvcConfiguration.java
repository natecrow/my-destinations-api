package com.my.destinations.api.mydestinationsapi.configuration;

import com.my.destinations.api.mydestinationsapi.model.Destination;
import com.my.destinations.api.mydestinationsapi.model.DestinationsList;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class RestMvcConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        // Show IDs for destinations in API.
        config.exposeIdsFor(Destination.class);
        config.exposeIdsFor(DestinationsList.class);
        
        // Disable default exposure of rest repositories.
        config.disableDefaultExposure();
    }
}
