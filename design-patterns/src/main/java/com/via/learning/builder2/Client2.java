package com.via.learning.builder2;

import java.time.LocalDate;

import com.via.learning.builder.Address;
import com.via.learning.builder.User;
import com.via.learning.builder2.UserDTO;
import com.via.learning.builder2.UserDTO.UserDTOBuilder;

public class Client2 {
	
	public static void main(String[] args) {
		User user = createUser();
		
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		System.out.println(dto);
	}
	
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthDate(user.getBirthdate())
				.build();
	}
	
	public static User createUser() {
		User user = new User();
		user.setBirthdate(LocalDate.of(1993, 2, 14));
		user.setFirstName("Valentin");
		user.setLastName("Alberto");
		Address address = new Address();
		address.setHouseNumber("100010");
		address.setStreet("Maligaya St");
		address.setCity("Bataan");
		address.setState("Golden State");
		address.setZipcode("0990");
		user.setAddress(address);

		return user;
	}

}
