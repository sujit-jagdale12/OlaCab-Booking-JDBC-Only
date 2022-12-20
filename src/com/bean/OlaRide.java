package com.bean;

public class OlaRide {
	private int rideId;
	private String rideName;
	private String rideStart;
	private String rideEnd;
	private double bill;
	public OlaRide() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OlaRide(String rideName, String rideStart, String rideEnd, double bill) {
		super();
		this.rideName = rideName;
		this.rideStart = rideStart;
		this.rideEnd = rideEnd;
		this.bill = bill;
	}
	public int getRideId() {
		return rideId;
	}
	public void setRideId(int rideId) {
		this.rideId = rideId;
	}
	public String getRideName() {
		return rideName;
	}
	public void setRideName(String rideName) {
		this.rideName = rideName;
	}
	public String getRideStart() {
		return rideStart;
	}
	public void setRideStart(String rideStart) {
		this.rideStart = rideStart;
	}
	public String getRideEnd() {
		return rideEnd;
	}
	public void setRideEnd(String rideEnd) {
		this.rideEnd = rideEnd;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public OlaRide(String rideStart, String rideEnd) {
		this.rideStart = rideStart;
		this.rideEnd = rideEnd;
	}

}
