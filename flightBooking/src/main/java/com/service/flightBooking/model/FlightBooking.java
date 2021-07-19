package com.service.flightBooking.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Data
@Entity
public class FlightBooking {

	@Id
	@GeneratedValue(generator = "booking-id-gen")
	@GenericGenerator(name = "booking-id-gen", parameters = @Parameter(name = "prefix", value = "FB"), strategy = "com.augustine.admin.entity.util.StringSequenceIdGenerator")
	private String id;

	@ManyToOne
	private Passenger passenger;

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinTable(name = "booking_flights", joinColumns = @JoinColumn(name = "booking_id"), inverseJoinColumns = @JoinColumn(name = "flight_id"))
	private Set<Flight> flights;

	
	

}
