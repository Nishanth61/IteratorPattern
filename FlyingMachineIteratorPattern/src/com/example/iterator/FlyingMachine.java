package com.example.iterator;

/**
 *
 * FlyingMachine class
 *
 */
public abstract class FlyingMachine {

	int capacity;
	String name;
	String type;
	int businessSeats;
	int economicSeats;
	String engine;

	public void design() {

		System.out.println(" Design :" + this.name + " : " + this.type + " : " + this.engine + " : " + this.capacity
				+ " : " + this.businessSeats + " : " + this.economicSeats);

	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public int getEconomicSeats() {
		return economicSeats;
	}

	public void setEconomicSeats(int economicSeats) {
		this.economicSeats = economicSeats;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
