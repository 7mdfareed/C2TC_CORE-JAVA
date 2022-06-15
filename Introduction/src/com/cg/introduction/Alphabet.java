package com.cg.introduction;

public class Alphabet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'J';
		
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an alphabet.");
		else
			System.out.println(c + " is not an alphabet");
	}
}