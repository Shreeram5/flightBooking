package com.service.flightBooking.model;

import java.util.List;

public class Bookings {
	
	private String Id;
	private Passenger passenger;
	private List<Flight> flights;
	
	public void BookingModel(String Id, Passenger passenger, List<Flight> flights) {
		this.Id=Id;
		this.passenger=passenger;
		this.flights=flights;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

}
