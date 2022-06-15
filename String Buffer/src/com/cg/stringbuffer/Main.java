package com.cg.stringbuffer;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "study";
		str.concat("night");
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("study");
		str1.append("night");
		System.out.println(str1);
		
		StringBuffer sb = new StringBuffer("hello");
		sb.insert(1,"java");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("hello");
		sb1.replace(1,3,"java");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("hello");
		sb2.delete(1,3);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer("hello");
		sb3.reverse();
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity());
		sb4.append("H");
		System.out.println(sb4.capacity());
		sb4.append("Java is the worst language");
		System.out.println(sb4.capacity());
		
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity());
		sb4.append("H");
		System.out.println(sb5.capacity());
		sb4.append("Java is the worst language");
		System.out.println(sb5.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb5.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb5.capacity());
	}
}