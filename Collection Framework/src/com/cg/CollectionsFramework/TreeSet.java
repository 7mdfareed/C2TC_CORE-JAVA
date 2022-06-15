package com.cg.CollectionsFramework;
import java.util.SortedSet;

public class TreeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet obj=(SortedSet) new TreeSet();
		obj.add(13);
		obj.add(34.67);
		obj.add(6);
		obj.add(21);
		obj.add("STRING");
		obj.add('c');
		System.out.println(obj);
	}

}
