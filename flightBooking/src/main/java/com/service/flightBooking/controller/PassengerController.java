package com.service.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.flightBooking.model.Passenger;
import com.service.flightBooking.service.PassengerService;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

	@Autowired
	private PassengerService passengerService;

	@PostMapping("/save")
	public List<Passenger> savePassengers(@RequestBody List<Passenger> passengers){
		passengerService.savePassengers(passengers);
		return passengers;		
	}
	
	@GetMapping("/getAll")
	public List<Passenger> getAllPassengers(){		
		return passengerService.getAllPassengers();		
	}

	@GetMapping("/{passengerId}")
	public Passenger getPassengerById(@PathVariable("passengerId") String id) {
		return passengerService.getPassengerById(id);
	}

}
