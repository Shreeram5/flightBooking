package com.service.flightBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.flightBooking.model.Airport;
import com.service.flightBooking.repository.AirportRepository;

@Service
public class AirportService {

	@Autowired
	private AirportRepository airportRepository;
	
	public List<Airport> listAll(){
		return airportRepository.findAll();
	}
	
	public void save(Airport airport) {
		airportRepository.save(airport);
	}
	
	public Airport get(String id) {
		return airportRepository.findByiataCode(id);
	}
	
	public void delete(String name) {
		airportRepository.deleteByIataCode(name);
	}
	
}
