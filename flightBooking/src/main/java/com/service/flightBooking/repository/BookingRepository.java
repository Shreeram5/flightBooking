package com.service.flightBooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.service.flightBooking.model.Bookings;
import com.service.flightBooking.model.Passenger;

public interface BookingRepository extends JpaRepository<Bookings, String>{

	Bookings getBookingById(String BookingId);

}
