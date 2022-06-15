package com.tns.multithreading;

class Eclipse1 implements Runnable{
	public void run() {
		System.out.println("Eclipse Thread Id is: "+Thread.currentThread().getId());
	}
}

class PPT1 implements Runnable{
	public void run() {
		System.out.println("PPT Thread Id is: "+Thread.currentThread().getId());
	}
}

class Notepad1 implements Runnable{
	public void run() {
		System.out.println("Notepad Thread Id is: "+Thread.currentThread().getId());
	}
}

class Eclipse2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Eclipse Thread Id is: "+Thread.currentThread().getId());
	}
  }
}

class PPT2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT Thread Id is: "+Thread.currentThread().getId());
	}
  }
}

class Notepad2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Notepad Thread Id is: "+Thread.currentThread().getId());
	}
  }
}
public class MultiThreadRunnable {
	public static void main(String[] args) {
		Eclipse1 obj1 = new Eclipse1();
		Thread t = new Thread(obj1);
		t.start();
		PPT1 obj2 = new PPT1();
		Thread t1 = new Thread(obj2);
		t1.start();
		Notepad1 obj3 = new Notepad1();
		Thread t2 = new Thread(obj3);
		t2.start();
		Eclipse2 obj4 = new Eclipse2();
		Thread t3 = new Thread(obj4);
		t3.start();
		PPT2 obj5 = new PPT2();
		Thread t4 = new Thread(obj5);
		t4.start();
		Notepad2 obj6 = new Notepad2();
		Thread t5 = new Thread(obj6);
		t5.start();
	}
}