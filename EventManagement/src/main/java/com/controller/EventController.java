package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.entity.Event;
import com.model.EventDTO;
import com.service.EventService;
import com.util.EventConverter;


public class EventController {

	@Autowired
	private EventService eventService;
	
	@Autowired
	private  EventConverter eventConverter;
	
	@PostMapping("/newEvent")
	public String createEvent(@RequestBody EventDTO eventDTO)
	{
		final EventDTO event= eventConverter.convertToEventDTO(eventDTO);
		return eventService.createEvent(event);
	}
	//using @PutMapping for updation purpose
	@PutMapping("/updateEvent/{name}")
	public EventDTO updateAddress(@PathVariable("name") String name, @RequestBody EventDTO eventDTO)
	{
		// create a object for Address class and convert it to entity
		Event event001 = eventConverter.convertToEvent(eventDTO);
		return eventDTO;
		
		
		
	}
	
	//geting all Event
	@GetMapping("/getAllEvent")
	public List<EventDTO>getAllEvent()
	{
		return eventService.getAllEvent();
	}
	
	//deleting all events
	@DeleteMapping("/deleteAllEvent")
	public void deleteAllEvent()
	{
		eventService.deleteAllDataOfEvent();
	}

}
