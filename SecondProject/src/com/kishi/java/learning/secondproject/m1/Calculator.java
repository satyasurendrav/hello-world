package com.kishi.java.learning.secondproject.m1;
import java.util.Scanner;
public class Calculator {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		float a,b,res;
		char choice,ch;
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.println("1.addition \n");
			System.out.println("2.substraction \n");
			System.out.println("3.multiplecation \n");
			System.out.println("4.division \n");
			System.out.println("5.exit \n\n");
			System.out.println("Enter your N-favorate option");
			choice = scan.next().charAt(0);
			switch(choice)
			{
			case '1':System.out.println("enter two numbers");
			a=scan.nextFloat();
			b=scan.nextFloat();
			res=a+b;
			System.out.println("Result =" +res);
			break;
			case '2':System.out.println("enter two numbers");
			a=scan.nextFloat();
			b=scan.nextFloat();
			res=a-b;
			System.out.println("Result =" +res);
			break;
			case '3':System.out.println("enter two numbers");
			a=scan.nextFloat();
			b=scan.nextFloat();
			res=a*b;
			System.out.println("Result =" +res);
			break;
			case '4':System.out.println("enter two numbers");
			a=scan.nextFloat();
			b=scan.nextFloat();
			res=a/b;
			System.out.println("Result =" +res);
			break;
			case '5':System.exit(0);
			break;
			default:System.out.println("wrong choice!!!");
			break;
			}
			System.out.println("\n..................................\n");
		}while(choice !=5);
	}
}
