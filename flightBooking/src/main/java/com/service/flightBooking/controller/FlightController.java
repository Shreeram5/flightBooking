package com.service.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.service.flightBooking.model.Airport;
import com.service.flightBooking.model.Flight;
import com.service.flightBooking.service.AirportService;
import com.service.flightBooking.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	FlightService service;
	
	@Autowired
	AirportService airportService;

	@RequestMapping("/flight")
	public String viewHomePage(Model model) {
		List<Flight> listFlight = service.listAll();
		model.addAttribute("listFlight", listFlight);
		return "flight.html";
	}

	@RequestMapping("/addflight")
	public String newAirportPage(Model model) {
		Flight flight = new Flight();
		
		List<Airport> listAirport = airportService.listAll();
		model.addAttribute(flight);
		model.addAttribute("listAirport", listAirport);
		return "new_flight";
	}

	@RequestMapping(value = "/saveflight", method = RequestMethod.POST)
	public String saveAirport(@ModelAttribute("flight") Flight flight) {
		service.save(flight);
		return "redirect:/flight";
	}

	@RequestMapping("/editflight/{sid}")
	public ModelAndView showEditFlightPage(@PathVariable(name = "sid") String sid) {
		ModelAndView mav = new ModelAndView("new_Flight");
		Flight flight = service.get(sid);
		mav.addObject("flight", flight);
		return mav;
	}

	@RequestMapping("/deleteflight/{sid}")
	public String deleteAirportPage(@PathVariable(name = "sid") String sid) {
		service.delete(sid);
		return "redirect:/flight";
	}

}

