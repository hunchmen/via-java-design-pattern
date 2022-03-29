/**
 * 
 */
package com.via.learning.builder;

import java.time.LocalDate;

/**
 * @author va.alberto
 *
 */
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
		
	}

	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthdate(user.getBirthdate())
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
