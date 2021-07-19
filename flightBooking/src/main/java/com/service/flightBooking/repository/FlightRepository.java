package com.service.flightBooking.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.service.flightBooking.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

	
	Flight findById(String iataCode);
	
	@Transactional
	@Modifying
	@Query("delete from Flight where id= :id")
	public void deleteById(@Param("id") String id);
	
	
}
