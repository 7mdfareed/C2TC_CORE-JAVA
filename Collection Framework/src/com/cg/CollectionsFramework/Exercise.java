package com.cg.CollectionsFramework;
import java.util.Iterator;
import java.util.*;

public class Exercise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h_set=new HashSet<String>();
		//use add() method to add values in the hash set
		h_set.add("Water");
		h_set.add("liquid");
		h_set.add("oil");
		h_set.add("drop");
		System.out.println("Original Hash Set: " +h_set);
		System.out.println("Size of the Hash Set: " +h_set.size());
	}
}