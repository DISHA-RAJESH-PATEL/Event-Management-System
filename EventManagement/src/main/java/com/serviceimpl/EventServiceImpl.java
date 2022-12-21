package com.serviceimpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.entity.Event;
import com.model.EventDTO;
import com.repository.EventRepository;
import com.service.EventService;
import com.util.EventConverter;

@Service
public class EventServiceImpl implements EventService {
		
		@Autowired
	 EventRepository eventRepository;
		
		@Autowired
		EventConverter eventConverter;

		private CrudRepository<Customer, Integer> eventRepository2;
		
		@Override
		public String createEvent(Event event) {
			String message= null;
			EventRepository.saveAll(event);
			if(event!=null)
			{
				message =" New Event saved successfully";
			}
			else 
			{
				message = " !! ERROR !! not saved......TRY AGAIN"; 
			}
			return message ;
		}
		



		
		public List<EventDTO> getAllEventS() {
		List<Customer> event= eventRepository.findAll(); 
		
		List<EventDTO> eventDTO=new ArrayList<>();
			for(Customer ev: event)
			{
				eventDTO.add(eventConverter.convertToEventDTO(ev));
			}
			
			return eventDTO;
		}

		
		public void deleteAllDataOfEvent() {
			
			eventRepository2 = null;
			eventRepository2.deleteAll();
			
		}

		

		@Override
		public EventDTO updateEvent(String name, Event event) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public EventDTO getEventByString(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String deleteEventByString(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<EventDTO> getAllEvent() {
			// TODO Auto-generated method stub
			return null;
		}





		@Override
		public String createEvent1(Event event) {
			// TODO Auto-generated method stub
			return null;
		}










}
