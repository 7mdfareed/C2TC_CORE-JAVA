package com.tns.multithreading;

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse Thread Id is: "+Thread.currentThread().getId());
	}
}

class PPT extends Thread{
	public void run() {
		System.out.println("PPT Thread Id is: "+Thread.currentThread().getId());
	}
}

class Notepad extends Thread{
	public void run() {
		System.out.println("Notepad Thread Id is: "+Thread.currentThread().getId());
	}
}


public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse obj1 = new Eclipse();
		obj1.start();
		PPT obj2 = new PPT();
		obj2.start();
		Notepad obj3 = new Notepad();
		obj3.start();
	}

}
