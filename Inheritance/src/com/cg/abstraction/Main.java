package com.cg.abstraction;

import java.util.*;
abstract class Movie{
	String title;
	abstract void setTitle(String s);
}
class Mymovie extends Movie{
	void setTitle(String s) {
		title = s;
	}
	String getTitle() {
		return title;
	}
}

public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your favourite movie title: ");
		Scanner s = new Scanner(System.in);
		String title = s.nextLine();
		Mymovie m = new Mymovie();
		m.setTitle(title);
		System.out.println("Your favourite title is: "+m.getTitle());
	}
}