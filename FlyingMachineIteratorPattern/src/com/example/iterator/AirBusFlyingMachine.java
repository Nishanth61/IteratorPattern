package com.example.iterator;

/**
 *
 * Air Bus FlyingMachine
 *
 */
public class AirBusFlyingMachine extends FlyingMachine {

	public AirBusFlyingMachine() {
		this.name = "AirBus";
		this.engine = " Rolls-Royce Trent XWB";
		this.capacity = 500;
		this.businessSeats = 50;
		this.economicSeats = 450;
		this.type = "Domestic";
	}
	
	public AirBusFlyingMachine(String type) {
		this.name = "AirBus";
		this.engine = " Rolls-Royce Trent XWB";
		this.capacity = 500;
		this.businessSeats = 50;
		this.economicSeats = 450;
		this.type = type;
	}

}
