package com.service.flightBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.flightBooking.model.Flight;
import com.service.flightBooking.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;
	
	public List<Flight> listAll(){
		return flightRepository.findAll();
	}
	
	public void save(Flight flight) {
		flightRepository.save(flight);
	}
	
	public Flight get(String id) {
		return flightRepository.findById(id);
	}
	
	public void delete(String name) {
		flightRepository.deleteById(name);
	}
	
}