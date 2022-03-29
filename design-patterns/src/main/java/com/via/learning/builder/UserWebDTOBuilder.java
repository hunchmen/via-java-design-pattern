/**
 * 
 */
package com.via.learning.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author va.alberto
 *
 */
public class UserWebDTOBuilder implements UserDTOBuilder {
	
	private static final String COMMA_WITH_SPACE = ", ";
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;

	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthdate(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears()); 
		return this;
	}
	
	@Override
	public UserDTOBuilder withAddress(Address address) {
		StringBuilder sb = new StringBuilder();
			sb.append(address.getHouseNumber());
			sb.append(COMMA_WITH_SPACE);
			sb.append(address.getStreet());
			sb.append(COMMA_WITH_SPACE);
			sb.append(address.getCity());
			sb.append(COMMA_WITH_SPACE);
			sb.append(address.getState());
			sb.append(COMMA_WITH_SPACE);
			sb.append(address.getZipcode());
		this.address = sb.toString();
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(firstName + " " + lastName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}



}
