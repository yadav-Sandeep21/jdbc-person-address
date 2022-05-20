package com.ty.PersonAddress.dto;

public class Address {
	private int aid;
	private String street;
	private String doornum;
	private String city;
	private String pin;
	private int pid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoornum() {
		return doornum;
	}
	public void setDoornum(String doornum) {
		this.doornum = doornum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", doornum=" + doornum + ", city=" + city + ", pin=" + pin
				+ ", pid=" + pid + "]";
	}
}
