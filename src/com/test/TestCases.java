package com.test;

import java.sql.SQLException;

import com.bean.OlaRide;
import com.dao.OlaRideDao;

public class TestCases {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		OlaRide ride=new OlaRide("Daya Kale", "Latur", "O-bad", 250);
//		OlaRideDao.bookRide(ride);
		
//		OlaRide olaRide=new OlaRide("Mumbai", "pune");
//		OlaRideDao.updateRide(olaRide, 1);
		
//		OlaRideDao.deleteRide(2);
		
//		OlaRideDao.getRide(3);
		
		OlaRideDao.getAllRides();
	}
}
