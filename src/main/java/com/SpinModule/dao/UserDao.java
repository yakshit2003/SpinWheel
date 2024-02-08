package com.SpinModule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;


import com.SpinModule.conn.DbConn;
import com.SpinModule.entity.UserDetails;


public class UserDao {

	private Connection conn;
	
	public UserDao(Connection conn) {
	super();
	this.conn=conn;
	}
	
	public static boolean registerUser(UserDetails u) {
		boolean f=false;
		
    String sql="insert into users (name,email,phone,state,district) values(?,?,?,?,?) ";
    try {
		PreparedStatement ps= DbConn.getConn().prepareStatement(sql);
		
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getPhone());
		ps.setString(4, u.getState());
		ps.setString(5, u.getDistrict());
		
		int rows=ps.executeUpdate();
		if(rows==1) {
			f=true;
		}
	} 
    catch (SQLException e) {
		
		e.printStackTrace();
	}
		return f;
	}
	

}
