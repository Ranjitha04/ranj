package com.flights.details.dao;

import org.springframework.data.repository.CrudRepository;

import com.flights.details.model.FlightDetails;

public interface FlightDetailsDao extends CrudRepository<FlightDetails, String>{
	
}
