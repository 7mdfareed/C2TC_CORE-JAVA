package com.tns.multithreading;

class Eclipse3 extends Thread{
	public void run() {
		System.out.println("Eclipse Thread Id is: "+Thread.currentThread().getId());
		System.out.println("Eclipse Thread Priority is: "+Thread.currentThread().getPriority());
	}
}

class PPT3 extends Thread{
	public void run() {
		System.out.println("PPT Thread Id is: "+Thread.currentThread().getId());
		System.out.println("PPT Thread Priority is: "+Thread.currentThread().getPriority());
	}
}

class Notepad3 extends Thread{
	public void run() {
		System.out.println("Notepad Thread Id is: "+Thread.currentThread().getId());
		System.out.println("Notepad Thread Priority is: "+Thread.currentThread().getPriority());
	}
}

public class MultiThreadPriority {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse3 obj7 = new Eclipse3();
		obj7.start();
		obj7.setPriority(6);
		PPT3 obj8 = new PPT3();
		obj8.start();
		obj8.setPriority(7);
		Notepad3 obj9 = new Notepad3();
		obj9.start();
		obj9.setPriority(6);
	}
}