package com.example.iterator;

/**
 *
 * Boeing FlyingMachine
 *
 */
public class BoeingFlyingMachine extends FlyingMachine {

	public BoeingFlyingMachine() {
		this.name = "Boeing";
		this.engine = "GE90";
		this.capacity = 1000;
		this.businessSeats = 100;
		this.economicSeats = 900;
		this.type = "International";
	}
	
	public BoeingFlyingMachine(String type) {
		this.name = "Boeing";
		this.engine = "GE90";
		this.capacity = 1000;
		this.businessSeats = 100;
		this.economicSeats = 900;
		this.type = type;
	}
	

}
