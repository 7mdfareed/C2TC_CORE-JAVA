package com.cg.inheritance;

public class Blackberry extends Mobile {

	public Blackberry(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return "This is Superclass Method: " + this.model;
	}
}
