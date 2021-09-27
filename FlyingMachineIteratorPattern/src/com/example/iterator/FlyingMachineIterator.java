package com.example.iterator;


public class FlyingMachineIterator implements CustomIterator {

	FlyingMachine[] fMachines;

	int pos = 0;

	public FlyingMachineIterator(FlyingMachine[] fMachines) {
		this.fMachines = fMachines;
	}

	@Override
	public boolean hasNext() {
		if (pos >= fMachines.length || fMachines[pos] == null)
			return false;
		else
			return true;
	}

	@Override
	public FlyingMachine next() {
		FlyingMachine fMachine = fMachines[pos];
		pos += 1;
		return fMachine;
	}

}
