package com.cg.CollectionsFramework;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sites=new TreeSet<>();
		sites.add("Technical");
		sites.add("Technology");
		sites.add("Quiz");
		sites.add("code");
		System.out.println("Sorted Set: " +sites);
		System.out.println("First: " +sites.first());
		System.out.println("Sorted Set: "+sites.last());
	}

}
