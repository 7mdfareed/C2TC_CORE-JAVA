package com.cg.stringbuffer;

public class ContainsExampleMain2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello T#E#C#H#N#O#S#E#R#V#E@2.0 readers";
		boolean isContains = str.contains("T#E#C#H#N#O#S#E#R#V#E");
		System.out.println(isContains);
		System.out.println(str.contains("TECHNOSERVE"));
	}
}
