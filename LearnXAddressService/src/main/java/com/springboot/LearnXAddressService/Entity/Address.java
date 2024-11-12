package com.springboot.LearnXAddressService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_address")
public class Address {

	@Id
	private int address_Id;
	private String state;
	private String city;
	private int zip_code;
	private String country;

	public int getAddress_Id() {
		return address_Id;
	}

	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
