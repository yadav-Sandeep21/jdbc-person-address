package com.ty.PersonAddress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.PersonAddress.dto.Person;
import com.ty.PersonAddress.util.ConnectionObject;

public class PersonDao {
	
	public int savePerson(Person person) {
		
		String sql="INSERT INTO person VALUES(?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		
		try {
			PreparedStatement preparestatement=connection.prepareStatement(sql);
			preparestatement.setInt(1,person.getPid());
			preparestatement.setString(2,person.getName());
			preparestatement.setString(3,person.getEmail());
			preparestatement.setString(4,person.getPhone());
			
			return preparestatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
		
	}
	public Person getPersonById(int pid) {
		String sql="SELECT * FROM person WHERE pid=?";
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparestatement=connection.prepareStatement(sql);
			preparestatement.setInt(1,pid);
			
			ResultSet resultset=preparestatement.executeQuery();
			if(resultset.next()) 
			{
				Person person=new Person();
				person.setPid(resultset.getInt(1));
				person.setName(resultset.getString(2));
				person.setEmail(resultset.getString(3));
				person.setPhone(resultset.getString(4));
				return person;
			}
			else
			{
				System.out.println("No such person found");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
