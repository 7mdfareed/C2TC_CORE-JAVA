package com.cg.regex;

import java.util.regex.*;
class RegexExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","mk"));
		System.out.println(Pattern.matches(".s","mst"));
		System.out.println(Pattern.matches(".s","amms"));
		System.out.println(Pattern.matches(".s","ms"));
		System.out.println();
		System.out.println(Pattern.matches("[amn]","abcd"));
		System.out.println(Pattern.matches("[amn]","a"));
		System.out.println(Pattern.matches("[amn]","ammmna"));
	}
}