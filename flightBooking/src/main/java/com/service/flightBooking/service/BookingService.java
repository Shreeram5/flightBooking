package com.service.flightBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.flightBooking.model.Bookings;
import com.service.flightBooking.model.FlightBooking;
import com.service.flightBooking.repository.BookingRepository;

@Service
public abstract class BookingService {

	@Autowired
	BookingRepository bookingrepository;

	public void saveBookings(List<Bookings> bookings) {
		bookingrepository.saveAll(bookings);
	}

	public List<Bookings> getAllBookings(){
		return bookingrepository.findAll();
	}
	public Bookings getByBookingId( String BookingId) {
		return bookingrepository.getBookingById(BookingId);
	}

}
