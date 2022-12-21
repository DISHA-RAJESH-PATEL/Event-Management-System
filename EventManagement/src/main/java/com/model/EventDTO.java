package com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EventDTO {
private String  name;
	
	@NotNull	
	@Size(min=1)
	private String city;
	
	@NotNull
	@Size(min=2)
	private String state;
	
	@NotNull
	@Size(min=3, max=5)
	private int fees;

}
