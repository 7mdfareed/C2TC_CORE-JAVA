package com.cg.abstraction;

abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	void run() {
		System.out.println("It's running safely");
	}
}

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.run();
	}
}
