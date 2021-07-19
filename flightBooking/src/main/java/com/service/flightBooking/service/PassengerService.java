package com.service.flightBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.flightBooking.model.Passenger;
import com.service.flightBooking.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	public void savePassengers(List<Passenger> passengers) {
		passengerRepository.saveAll(passengers);
	}

	public List<Passenger> getAllPassengers() {		
		return passengerRepository.findAll();
	}

	public Passenger getPassengerById(String passengerId) {		
		return passengerRepository.getPassengerById(passengerId);
	}

}
