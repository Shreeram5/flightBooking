package com.service.flightBooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Airport {

	@Id
	private String iataCode;
	private String name;
	private String countryIsoCode;
}
