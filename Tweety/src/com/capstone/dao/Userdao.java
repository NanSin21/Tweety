package com.capstone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.capstone.pojo.User;
import com.capstone.util.Userutil;



public class Userdao {
	public static User loginUser(String username,String password)
	{

		User c = new User();
		try {
		 Connection con = Userutil.getConnection();
		 PreparedStatement ps=con.prepareStatement(  
				    "select * from user1 where username=? and pwd=?");  
				  
				ps.setString(1,username);  
				ps.setString(2,password);  
				              
				ResultSet rs=ps.executeQuery(); 
				if(rs.next()) 
				{
					c.setUser_id(rs.getInt(1));
					c.setUsername(rs.getString(2));
					c.setEmail(rs.getString(3));
					c.setPhone(rs.getLong(4));
					c.setPassword(rs.getString(5));
				}
				 
				              
				}catch(Exception e){System.out.println(e);}  
				  
				return c;  
			
	}

	public int saveUser(User u1) {
		
		int status = 0;
		try {
			 Connection con = Userutil.getConnection();
			 PreparedStatement ps=con.prepareStatement("insert into user1(username, email, phone, pwd) values(?, ?, ?, ?)");
			 ps.setString(1, u1.getUsername());
			 ps.setString(2, u1.getEmail());
			 ps.setLong(3, u1.getPhone());
			 ps.setString(4, u1.getPassword());
			 status = ps.executeUpdate();
		}
		catch(Exception ex) {}
		return status;
	}

}
