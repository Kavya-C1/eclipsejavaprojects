package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDb {
	
	 static Connection connection;
	    public static Connection OpenConnection(){
	    	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	
	        String url = "jdbc:mysql://localhost:3306/doctorAppMaven";
	        String username = "root";
	        String password = "root";
	        try{
	            connection = DriverManager.getConnection(url, username, password);
	            System.out.println("connected to db");

	        }catch (Exception e){
	            e.printStackTrace();

	        }
	        return connection;
	    }

}
