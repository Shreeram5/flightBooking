package com.service.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.flightBooking.model.Bookings;
import com.service.flightBooking.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {


	@Autowired
	private BookingService bookingService;

	@PostMapping("/save")
	public List<Bookings> saveBookings(@RequestBody List<Bookings> bookings){
		bookingService.saveBookings(bookings);
		return bookings;
	}

	@GetMapping
	public List<Bookings> getAllBookings(){
		return bookingService.getAllBookings();
	}

	@GetMapping("/{booking Id}")
	public Bookings getByBookingId(@PathVariable("bookingId") String BookingId){
		return bookingService.getByBookingId(BookingId);
	}
}
