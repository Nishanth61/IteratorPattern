package com.example.iterator;

class AirbusFlyingMachineCollection implements FlyingMachineCollection {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	FlyingMachine[] airbusFlyingMachineList;

	public AirbusFlyingMachineCollection() {
		airbusFlyingMachineList = new AirBusFlyingMachine[MAX_ITEMS];

		addItem(new AirBusFlyingMachine("domestic"));
		addItem(new AirBusFlyingMachine("international"));
		addItem(new AirBusFlyingMachine("domestic"));
		addItem(new AirBusFlyingMachine("cargo"));
		addItem(new AirBusFlyingMachine("domestic"));
	}

	public void addItem(AirBusFlyingMachine afm) {

		if (numberOfItems >= MAX_ITEMS)
			System.err.println("Full");
		else {
			airbusFlyingMachineList[numberOfItems] = afm;
			numberOfItems = numberOfItems + 1;
		}
	}

	public FlyingMachineIterator createIterator() {
		return new FlyingMachineIterator(airbusFlyingMachineList);
	}
}