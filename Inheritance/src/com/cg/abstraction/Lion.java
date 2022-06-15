package com.cg.abstraction;

abstract class Animal{
	public abstract void sound();
}

public class Lion extends Animal{
	public void sound(){
		System.out.println("Roar");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Lion();
		obj.sound();
	}

}