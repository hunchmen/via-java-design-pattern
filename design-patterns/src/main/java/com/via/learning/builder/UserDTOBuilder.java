package com.via.learning.builder;

import java.time.LocalDate;

// Abstract builder
public interface UserDTOBuilder  {
	
	//methods to build "parts" of product at a time
	UserDTOBuilder withFirstName(String fname);
	
	UserDTOBuilder withLastName(String lname);
	
	UserDTOBuilder withAddress(Address address);
	
	UserDTOBuilder withBirthdate(LocalDate date);
	
	//method to assemble final product
	UserDTO build();
	
	//(optional) method to fetch already built object
	UserDTO getUserDTO();
}
