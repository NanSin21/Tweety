package com.capstone.util;

import java.sql.DriverManager;
import java.sql.*;

public class Userutil {
	
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	       
	    	Class.forName("com.mysql.jdbc.Driver");  
	        
	        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone","root","");  
	    }
	    catch(Exception e){System.out.println(e);}  
	    return con;  
	
	
	}
}

