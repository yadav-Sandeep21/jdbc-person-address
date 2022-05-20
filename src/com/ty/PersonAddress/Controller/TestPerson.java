package com.ty.PersonAddress.Controller;

import com.ty.PersonAddress.dao.PersonDao;
import com.ty.PersonAddress.dto.Person;

public class TestPerson {

	public static void main(String[] args) {
		//Save Person
		
//		Person person=new Person();
//		
//		person.setPid(1);
//		person.setName("Sandeep");
//		person.setEmail("san@gmail.com");
//		person.setPhone("sandeep");
//		
//		PersonDao dao=new PersonDao();
//		dao.savePerson(person);
		
		//Get Person By Id
		PersonDao dao=new PersonDao();
		
	    Person v = dao.getPersonById(1);
		System.out.println(v);
		
	}

}
