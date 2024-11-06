// Program to demonstrate final Variable
package com.tns.ifet.daysix.usingfinal;

public class FinalVariable {

	final int x = 100;
	final static int  Y = 0;

	final static int Z = 10;

	void change() {
		int x = 30; // final variables can't be reassigned
		int Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		int Y = 20;
		int Z = 100; 
		
		System.out.println("Value of Y: " + Y);
	}

}
