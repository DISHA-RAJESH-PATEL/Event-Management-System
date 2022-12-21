package com.util;

import org.springframework.beans.BeanUtils;

import com.entity.Customer;
import com.entity.Event;
import com.model.EventDTO;

public class EventConverter {

	 public Event convertToAddressEntity(EventDTO  eventDTO)
	   {
		Event event=new Event();
		if(eventDTO!=null)
		{
			BeanUtils.copyProperties(eventDTO, event);
		}
		return event;
	   }

	 public EventDTO convertToEventDTO(EventDTO eventDTO2)
	 {
		 EventDTO eventDTO=new EventDTO();
		if(eventDTO2!=null)
		{
			BeanUtils.copyProperties(eventDTO2, eventDTO);
		}
		return eventDTO;
	 }

	public Event convertToEvent(EventDTO eventDTO) {
		// TODO Auto-generated method stub
		return null;
	}
}
