package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Teacher;
import com.jsp.helper.HelperClass;

public class Teacherdao {
	HelperClass hc=new HelperClass();
	public Teacher saveTeacher(Teacher tc) {
	Connection c = hc.getConnection();
	String sql = "INSERT INTO teacher VALUES(?,?,?,?)";
	try {
		PreparedStatement preparedStatement=c.prepareStatement(sql);
		preparedStatement.setInt(1,tc.getId());
		preparedStatement.setString(2,tc.getName());
		preparedStatement.setString(3,tc.getEmail());
		preparedStatement.setLong(4,tc.getCno());
		preparedStatement.execute();
		c.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return tc;
	
	}
	public Teacher deleteTeacher(Teacher tc) {
		Connection c = hc.getConnection();
		String sql = "DELETE FROM teacher WHERE ID=?";
		try {
			PreparedStatement preparedStatement=c.prepareStatement(sql);
			preparedStatement.setInt(1,tc.getId());
			preparedStatement.executeUpdate();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tc;
		
		}
	public Teacher updateTeacher(Teacher tc) {
		Connection c = hc.getConnection();
		String sql = "UPDATE teacher set email = 'pratham@xyz' where id=?";
		try {
			PreparedStatement preparedStatement=c.prepareStatement(sql);
			preparedStatement.setInt(1,tc.getId());
			preparedStatement.executeUpdate();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tc;
		
		}
}
