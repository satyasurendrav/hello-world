package com.kishi.java.learning.secondproject.m1;
import java.util.Scanner;
public class CalculatorIf {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		float a,b,res;
		char choice;
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
			if(choice=='1') {
				System.out.println("enter two numbers");
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a+b;
				System.out.println("Result =" +res);
			}else if(choice=='2') {
				System.out.println("enter two numbers");
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a-b;
				System.out.println("Result =" +res);
			}else if(choice=='3') {
				System.out.println("enter two numbers");
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a*b;
				System.out.println("Result =" +res);
			}else if(choice=='4') {
				System.out.println("enter two numbers");
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a/b;
				System.out.println("Result =" +res);
			}else if(choice=='5') {
				System.out.println("wrong choice!!!");
			}
			System.out.println("\n..................................\n");
		}while(choice !=5);
	}
}
