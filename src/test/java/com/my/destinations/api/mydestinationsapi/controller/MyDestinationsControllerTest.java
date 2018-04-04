// package com.my.destinations.api.mydestinationsapi.controller;

// import static org.junit.Assert.assertEquals;

// import com.my.destinations.api.mydestinationsapi.model.Address;
// import com.my.destinations.api.mydestinationsapi.model.Destination;
// import com.my.destinations.api.mydestinationsapi.repository.DestinationRepository;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Mockito;
// import org.mockito.runners.MockitoJUnitRunner;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;

// @RunWith(MockitoJUnitRunner.class)
// public class MyDestinationsControllerTest {

//     @InjectMocks
//     private MyDestinationsController myDestinationsController;

//     @Mock
//     private DestinationRepository destinationRepository;

//     @Test
//     public void createDestination_shouldCreateDestination_whenValidDestinationIsGiven() {
        
//         Address address = new Address();
//         address.setStreet("85 N Policy St");
//         address.setCity("Salem");
//         address.setState("NH");
//         address.setZip("03079");
//         address.setLinkToMap("linkToMap");

//         Destination destination = new Destination();
//         destination.setAddress(address);
//         destination.setName("Canobie Lake Park");
//         destination.setCost("$39");
//         destination.setDateToVisit("05/11/2018");
//         destination.setLinkToWebsite("http://www.canobie.com/");
//         destination.setNotes("Best to go on a Spring weekend or Summer weekday. ~1 hr drive.");

//         // Mock external methods
//         Mockito.when(this.destinationRepository.save(Mockito.any(Destination.class))).thenReturn(destination);

//         // Execute method under test
//         ResponseEntity<Destination> responseEntity = this.myDestinationsController.createDestination(destination);

//         // Verify results
//         Mockito.verify(this.destinationRepository).save(destination);
//         assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//         assertEquals(destination, responseEntity.getBody());
//     }
// }
