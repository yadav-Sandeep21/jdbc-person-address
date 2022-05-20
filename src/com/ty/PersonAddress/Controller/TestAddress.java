package com.ty.PersonAddress.Controller;

import com.ty.PersonAddress.dao.AddressDao;
import com.ty.PersonAddress.dto.Address;

public class TestAddress {

	public static void main(String[] args) {
		
		//Save Address
		/*
		Address address=new Address();
		address.setAid(2);
		address.setStreet("18th d cross");
		address.setDoornum("18");
		address.setCity("Bangalore");
		address.setPin("562131");
		address.setPid(1);
		
		AddressDao dao=new AddressDao();
		dao.saveAddress(address);
		*/
		
		//Get Address By Id
		
		AddressDao dao=new AddressDao();
		Address ad=dao.getAddressById(2);
		System.out.println(ad);
	}

}
