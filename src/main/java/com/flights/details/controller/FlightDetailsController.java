package com.flights.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flights.details.model.FlightDetails;
import com.flights.details.service.FlightDetailsService;

@RestController
public class FlightDetailsController {
	
	@Autowired
	FlightDetailsService flightDetailsService;

	@GetMapping("all")
	public List<FlightDetails> getAllFlightDetails() {
		return flightDetailsService.getAllFlightDetails();
	}
	
	@GetMapping("{flightcode}")
	public FlightDetails getFlightDetailById(@PathVariable String flightcode) {
		return flightDetailsService.getFlightDetailsById(flightcode);
	}
	
	@PostMapping("/add")
	public void addFlightDetails(@RequestBody FlightDetails flightDetails) {
		flightDetailsService.addFlightDetails(flightDetails);
	}
	
	@PutMapping("/update/{flightCode}") 
	public void updateFlightDetails(@PathVariable String flightCode, 
			@RequestBody FlightDetails flightDetails) {
		flightDetailsService.updateFlightDetails(flightCode, flightDetails);
	}
	
	@DeleteMapping("/delete/{flightCode}")
	public void deleteFlightDetail(@PathVariable String flightCode) {
		flightDetailsService.deleteFlightDetail(flightCode);
	}
}
