package com.example.iterator;

class BoeingFlyingMachineCollection implements FlyingMachineCollection {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	FlyingMachine[] boeingFlyingMachineList;

	public BoeingFlyingMachineCollection() {
		boeingFlyingMachineList = new BoeingFlyingMachine[MAX_ITEMS];

		addItem(new BoeingFlyingMachine("domestic"));
		addItem(new BoeingFlyingMachine("international"));
		addItem(new BoeingFlyingMachine("international"));
		addItem(new BoeingFlyingMachine("domestic"));
		addItem(new BoeingFlyingMachine("cargo"));
	}

	public void addItem(BoeingFlyingMachine lcb) {

		if (numberOfItems >= MAX_ITEMS)
			System.err.println("Full");
		else {
			boeingFlyingMachineList[numberOfItems] = lcb;
			numberOfItems = numberOfItems + 1;
		}
	}

	public FlyingMachineIterator createIterator() {
		return new FlyingMachineIterator(boeingFlyingMachineList);
	}
}