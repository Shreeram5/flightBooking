package com.service.flightBooking.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
public class Flight {

	@Id
	@GeneratedValue(generator = "flight-id-gen")
	@GenericGenerator(name = "flight-id-gen", 
		parameters = @Parameter(name = "prefix", value = "FL"), 
		strategy = "com.augustine.admin.entity.util.StringSequenceIdGenerator")
	private String id;
	private String name;
	private String departure;
	private String arrival;
	@DateTimeFormat(pattern = "dd/MM/yyyy h:mm a")
	private Date departureDate;
	@DateTimeFormat(pattern = "dd/MM/yyyy h:mm a")
	private Date arrivalDate;
	
	@ManyToMany(mappedBy = "flights", fetch = FetchType.LAZY)
	private Set<FlightBooking> bookings;

	public Flight() {
		super();
	}


}
