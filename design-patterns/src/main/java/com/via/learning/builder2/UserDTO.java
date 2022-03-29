package com.via.learning.builder2;

import java.time.LocalDate;
import java.time.Period;

import com.via.learning.builder.Address;
import com.via.learning.common.util.CommonUtil;

public class UserDTO {

	private String name;
	private String address;
	private String age;


	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name = " + name + "\naddress = " + address + "\nage = " + age;
	}
	
	//Get builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}
	
	//Builder
	public static class UserDTOBuilder {

		private String firstName;
		private String lastName;
		private String age;
		private String address;
		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			StringBuilder sb = new StringBuilder();
			sb.append(address.getHouseNumber());
			sb.append(CommonUtil.COMMA_WITH_SPACE);
			sb.append(address.getStreet());
			sb.append(CommonUtil.COMMA_WITH_SPACE);
			sb.append(address.getCity());
			sb.append(CommonUtil.COMMA_WITH_SPACE);
			sb.append(address.getState());
			sb.append(CommonUtil.COMMA_WITH_SPACE);
			sb.append(address.getZipcode());
			this.address = sb.toString();
			return this;
		}

		public UserDTOBuilder withBirthDate(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
			this.age = Integer.toString(ageInYears.getYears());
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(firstName + CommonUtil.SPACE + lastName);
			userDTO.setAge(age);
			userDTO.setAddress(address);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}

	}
}
