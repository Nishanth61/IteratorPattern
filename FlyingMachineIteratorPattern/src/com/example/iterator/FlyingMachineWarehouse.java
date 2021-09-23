package com.example.iterator;

public class FlyingMachineWarehouse {

	BoeingFlyingMachineCollection boeingCollection;
	AirbusFlyingMachineCollection airbusCollection;

	public FlyingMachineWarehouse(BoeingFlyingMachineCollection boeingCollection,
			AirbusFlyingMachineCollection airbusCollection) {
		this.boeingCollection = boeingCollection;
		this.airbusCollection = airbusCollection;
	}

	public void printFlyingMachineCollection() {
		FlyingMachineIterator boeingIterator = boeingCollection.createIterator();
		FlyingMachineIterator airbusIterator = airbusCollection.createIterator();

		printFlyingMachineCollection(boeingIterator, null);
		printFlyingMachineCollection(airbusIterator, null);

	}

	private void printFlyingMachineCollection(FlyingMachineIterator flyingMachineIterator, String type) {

		while (flyingMachineIterator.hasNext()) {
			FlyingMachine flyingMachine = flyingMachineIterator.next();
			if (type == null) {
				flyingMachine.design();
				System.out.println("");
			} else if (type.equals(flyingMachine.getType())) {
				flyingMachine.design();
				System.out.println("");
			}

		}

	}

	public void printDomesticFlyingMachineCollection() {
		FlyingMachineIterator boeingIterator = boeingCollection.createIterator();
		FlyingMachineIterator airbusIterator = airbusCollection.createIterator();

		printFlyingMachineCollection(boeingIterator, "domestic");
		printFlyingMachineCollection(airbusIterator, "domestic");

	}

	public void printInternationalFlyingMachineCollection() {
		FlyingMachineIterator boeingIterator = boeingCollection.createIterator();
		FlyingMachineIterator airbusIterator = airbusCollection.createIterator();

		printFlyingMachineCollection(boeingIterator, "international");
		printFlyingMachineCollection(airbusIterator, "international");

	}

	public void printCargoFlyingMachineCollection() {
		FlyingMachineIterator boeingIterator = boeingCollection.createIterator();
		FlyingMachineIterator airbusIterator = airbusCollection.createIterator();

		printFlyingMachineCollection(boeingIterator, "cargo");
		printFlyingMachineCollection(airbusIterator, "cargo");

	}

}
