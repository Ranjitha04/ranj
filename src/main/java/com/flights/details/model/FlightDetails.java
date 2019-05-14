package com.flights.details.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "flightdetails")
public class FlightDetails {

	@Id
	@Column(name = "flightcode",unique= true, length= 10)
	private String flightCode;
	
	@Column(name = "airlinename", length= 20)
	private String airlineName; 
	
	@Column(name = "planetype", length= 20)
	private String planeType;
	
	@Column(name = "departuredate")
	private Date departureDate;
	
	@Column(name = "origin", length= 20)
	private String origin;
	
	@Column(name = "destination", length= 20)
	private String destination;
	
	@Column(name = "price", length= 11)
	private int price;
	
	
	
	
	public FlightDetails() {
		
	}

	public FlightDetails(String flightCode, String airlineName, String planeType, Date departureDate, String origin,
			String destination, int price) {
		super();
		this.flightCode = flightCode;
		this.airlineName = airlineName;
		this.planeType = planeType;
		this.departureDate = departureDate;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
