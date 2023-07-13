package com.Test;
import java.util.*;
public class MainCalculator {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter from below choice");
		System.out.println("1.Addition.\n2.Substraction\n3.Multiplication\n4.Division");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Enter 1st num");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd num");
		int num2=sc.nextInt();
		
		System.out.println("Sum is "+c.addition(num1, num2));
		break;
		
		case 2 : System.out.println("Enter 1st num");
		int num3=sc.nextInt();
		System.out.println("Enter 2nd num");
		int num4=sc.nextInt();
		
		System.out.println(" Substraction is "+c.multiplication(num3, num4));
		break;
		
		case 3:System.out.println("Enter 1st num");
		int num5=sc.nextInt();
		System.out.println("Enter 2nd num");
		int num6=sc.nextInt();
		
		System.out.println("Multiplication is "+c.multiplication(num5, num6));
		break;
		
		
		case 4:System.out.println("Enter 1st num");
		double num7=sc.nextInt();
		System.out.println("Enter 2nd num");
		double num8=sc.nextInt();
		
		System.out.println("Division is "+c.division(num7, num8));
		break;
		
		default : System.out.println("Invalid Choice");
		}

	}

}
