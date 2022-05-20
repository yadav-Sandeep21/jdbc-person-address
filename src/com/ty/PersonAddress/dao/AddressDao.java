package com.ty.PersonAddress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.PersonAddress.dto.Address;
import com.ty.PersonAddress.util.ConnectionObject;

public class AddressDao {
	
public int saveAddress(Address address) {
		
		String sql="INSERT INTO address VALUES(?,?,?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		
		try {
			PreparedStatement preparestatement=connection.prepareStatement(sql);
			preparestatement.setInt(1,address.getAid());
			preparestatement.setString(2,address.getStreet());
			preparestatement.setString(3,address.getDoornum());
			preparestatement.setString(4,address.getCity());
			preparestatement.setString(5,address.getPin());
			preparestatement.setInt(6,address.getPid());
			
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

public Address getAddressById(int aid) {
	String sql="SELECT * FROM address WHERE aid=?";
	Connection connection=ConnectionObject.getConnection();
	
	try {
		PreparedStatement preparestatement=connection.prepareStatement(sql);
		preparestatement.setInt(1,aid);
		
		ResultSet resultset=preparestatement.executeQuery();
		if(resultset.next()) {
			Address address=new Address();
			address.setAid(resultset.getInt(1));
			address.setStreet(resultset.getString(2));
			address.setDoornum(resultset.getString(3));
			address.setCity(resultset.getString(4));
			address.setPin(resultset.getString(5));
			address.setPid(resultset.getInt(6));
			return address;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
}
