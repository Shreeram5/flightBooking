package com.service.flightBooking.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.service.flightBooking.model.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long>{

	Airport findByiataCode(String iataCode);
	
	@Transactional
	@Modifying
	@Query("delete from Airport where iataCode = :iataCode")
	public void deleteByIataCode(@Param("iataCode") String iataCode);
	

}
