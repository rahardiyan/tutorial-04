package com.apap.tu04.service;



import java.util.List;
import com.apap.tu04.model.FlightModel;



/**
 * FlightService
 */

public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(Long id);
	FlightModel getFlightDetailByFlightNumber(String flightNumber);
	List<FlightModel> getAllFlight();
	
	
	
}


