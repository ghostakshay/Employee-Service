package com.employee.employee.model;

public class AddressModel {
	private int id;
	private String streetline;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreetline() {
		return streetline;
	}
	public void setStreetline(String streetline) {
		this.streetline = streetline;
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
	private String city;
}
