package com.spi.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/india_airline")
public class Flight_Controller {
	@GetMapping(value = "/pune_airport" )
	public String Airline1() {
		return "Flight 101: Pune to Mumbai , Flight Time: 08:00am - 9:20am";
	}
		@PostMapping(value = "/mumbai_airport" )
		public String Airline2 () {
			return "Flight 109: Mumbai to USA , Flight Time: 09:00pm - 2:10pm";
		
	}
		
		@PutMapping(value = "/canada_airport" )
		public String Airline3 () {
			return "Flight 201: Canada to Delhi , Flight Time: 12:00pm - 11:15am";
		
		}
		
		@DeleteMapping(value = "/bengaluru_airport" )
		public String Airline4 () {
			return "Flight 201: bengaluru to Pune , Flight Time: 12:40am - 2:10am";
		
	}
		
	
	
	
	

}
