package com.service;

import java.util.List;

import com.entity.Event;
import com.model.EventDTO;



public interface EventService {
String createEvent1(Event event);
	
	public EventDTO updateEvent(String name, Event event);
	EventDTO getEventByString(String name );
	String deleteEventByString(String name );
	List<EventDTO> getAllEvent();

	String createEvent(Event event);

	void deleteAllDataOfEvent();

	String createEvent(EventDTO event);

	

}
