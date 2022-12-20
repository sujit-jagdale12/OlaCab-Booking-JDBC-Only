package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bean.OlaRide;

public class OlaRideDao {

	public static void bookRide(OlaRide ride) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RideApp","root","root");
		
		String sql="insert into ride(ridename,ridestart,rideend,bill)value(?,?,?,?);";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1, ride.getRideName());
		statement.setString(2, ride.getRideStart());
		statement.setString(3, ride.getRideEnd());
		statement.setDouble( 4, ride.getBill());
		
		statement.execute();
		System.out.println("Inserted");
	}
	
	public static void updateRide(OlaRide ride,int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RideApp","root","root");
		
		String sql="update ride set ridestart=?,rideend=? where rideid=?;";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1, ride.getRideStart());
		statement.setString(2, ride.getRideEnd());
		statement.setInt(3, id);
		
		statement.execute();
		System.out.println("Updated");
	}
	
	public static void deleteRide(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RideApp","root","root");
		
		String sql="delete from ride where rideid=?;";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		statement.execute();
		System.out.println("deleted");
	}
	
	public static void getRide(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RideApp","root","root");
		
		String sql="select *from ride where rideid=?;";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		ResultSet rs=statement.executeQuery();
		
		System.out.println("Ride details by Ride id");
		while(rs.next()){
			OlaRide  ride=new OlaRide();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getDouble(5));
			System.out.println("==============");
		}
	}
	public static void getAllRides() throws ClassNotFoundException, SQLException {		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RideApp","root","root");
		
		String sql="select *from ride;";
		
		PreparedStatement statement=connection.prepareStatement(sql);
		ResultSet rs=statement.executeQuery();
		
		System.out.println("All Ride details");
		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getDouble(5));
			System.out.println("==============");
		}
	}
}
