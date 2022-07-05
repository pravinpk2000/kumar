package com.training.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
public static Connection getPostgressConnection() throws InstantiationException, IllegalAccessException {
		
		Connection con =null;
		
		ResourceBundle labels = ResourceBundle.getBundle("Application");
		
		try {
			
			String url = labels.getString("datasource.postgres.url");
			String userName= labels.getString("datasource.postgres.username");
			String  password=labels.getString("datasource.postgres.password");
			
			String driverClass = labels.getString("datasource.postgres.driverclass");
			
			Class.forName(driverClass);
			
			
	
			  
			
			 con = DriverManager.getConnection(url,userName,password);
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		return con;
		
	}
	
//public static Connection getMySqlConnection() {
//		
//	}
}

