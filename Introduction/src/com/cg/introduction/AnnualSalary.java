package com.cg.introduction;

//use util.Scanner
//Enter name
//Enter Gross Salary it should be a double
//Enter Housing and Education Loan EMI, it should be a double
//Net Salary = Gross Salary - Housing EMI - Education EMI
//if GS >= 1000000 tax = 30%
//if GS >= 500000 tax = 20%
//if GS < 500000 tax = 5%
//Income Tax = Net Salary * tax percentage / 100
//Print Employee Name, Net Salary and Income Tax


import java.util.Scanner;

public class AnnualSalary
{
	private static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your Name: ");
		String empName = in.nextLine();
		System.out.println("Enter Gross Salary: ");
		double s = in.nextDouble();
		System.out.println("Enter Housing Loan EMI: ");
		double h = in.nextDouble();
		System.out.println("Enter Education Loan EMI: ");
		double l = in.nextDouble();

		double ti = s - h - l;

		int r = 0;

		if (ti >= 1000000)
			r = 30;
		else if (ti >= 500000)
			r = 20;
		else
			r = 5;

		double tax = ti * r / 100;

		System.out.println("Employee Name: " + empName);
		System.out.println("Taxable Income(Net Salary): " + ti);
		System.out.println("Income Tax: " + tax);
	}
}