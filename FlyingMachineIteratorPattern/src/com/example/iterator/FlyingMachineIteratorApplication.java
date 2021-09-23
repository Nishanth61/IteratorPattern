package com.example.iterator;

public class FlyingMachineIteratorApplication {

	public static void main(String[] args) {
		FlyingMachineWarehouse flyingMachineWarehouse = new FlyingMachineWarehouse(new BoeingFlyingMachineCollection(),
				new AirbusFlyingMachineCollection());
		System.out.println("print All Collection");

		flyingMachineWarehouse.printFlyingMachineCollection();
		System.out.println("");

		System.out.println("Domestic Collection");
		flyingMachineWarehouse.printDomesticFlyingMachineCollection();
		System.out.println("");

		System.out.println("International Collection");
		flyingMachineWarehouse.printInternationalFlyingMachineCollection();

		System.out.println("Cargo Collection");
		flyingMachineWarehouse.printCargoFlyingMachineCollection();
	}

}
