//Program to define concrete class that implements the Phone interface.
package com.tns.ifet.dayeight.instanceofinterface;

public class Jio implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}