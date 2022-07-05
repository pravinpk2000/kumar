package com.training.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.training.details.RegisterDetails;
import com.training.iface.TravelInterface;

public class TravelRepo implements TravelInterface<RegisterDetails>{
	
	private Connection con=null;
	

	public TravelRepo(Connection con) {
		super();
		this.con = con;
	}
	String UserName;
	String Name;
	String Phone;
	String Email;
	String password;
	int Age;
	String Gender;
	String ContactNumber;



	@Override
	public RegisterDetails add(RegisterDetails t) {
		
		String insert = "insert into Register1 values(?,?,?,?,?,?,?,?)";

		int rowAdded = 0;
		
		try {
			
			PreparedStatement ps= con.prepareStatement(insert);
			ps.setString(1, t.getUserName());
			ps.setString(2, t.getName());
			ps.setString(3, t.getPhone());
			ps.setString(4, t.getEmail());
			ps.setString(5, t.getPassword());
			ps.setInt(6,t.getAge());
			ps.setString(7, t.getGender());
			ps.setString(8, t.getContactNumber());
			
			rowAdded = ps.executeUpdate();
			
			
		}
		catch(Exception e) {
			
			
		}
		return rowAdded==1?t: null;
	}

}
