package edu.ucalgary.ensf409.layer;

public class TwoClass {
	private int value;

	public TwoClass(int number) {
		this.value = number;
	}

	public void output() {
		System.out.println("TwoClass was instantiated with " +
		value);
	}
}
