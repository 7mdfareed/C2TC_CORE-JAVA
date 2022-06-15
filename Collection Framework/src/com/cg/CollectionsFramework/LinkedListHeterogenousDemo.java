package com.cg.CollectionsFramework;
import java.util.List;
import java.util.LinkedList;

public class LinkedListHeterogenousDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		list.add("Raj");
		list.add(4);
		list.add("Hemanth");
		list.add(56.7f);
		list.add(null);
		list.add(6);
		System.out.println(((LinkedList) list).offer("Sanjay"));
		System.out.println(list);
	}
}