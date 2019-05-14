package com.flights.details.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.details.dao.FlightDetailsDao;
import com.flights.details.model.FlightDetails;

@Service
public class FlightDetailsService {

	@Autowired
	FlightDetailsDao flightDetailsDao;
	
	
	
	public List<FlightDetails> getAllFlightDetails() {
		List<FlightDetails> flightsList = new ArrayList<FlightDetails>();
		flightDetailsDao.findAll().forEach(flightsList :: add);
		return flightsList;
	}
	
	public FlightDetails getFlightDetailsById(String flightcode) {
		return flightDetailsDao.findById(flightcode).orElse(null);
	}
	
	public void addFlightDetails(FlightDetails flightDetails) {
		flightDetailsDao.save(flightDetails);
	}
	
	public void updateFlightDetails(String flightId, FlightDetails flightDetails) {
		flightDetailsDao.save(flightDetails);
	}
	
	public void deleteFlightDetail(String flightId) {
		if(getFlightDetailsById(flightId) != null) {
			flightDetailsDao.deleteById(flightId);
		}
	}
}
