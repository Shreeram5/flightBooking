package com.service.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.flightBooking.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, String>{

	Passenger getPassengerById(String passengerId);
}
