package com.kishi.java.learning.secondproject.m1;

import java.util.Scanner;

public class CalculateAvgAndPercentOf5Subjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Student number: ");
	          int studentNumber = scan.nextInt();
	          System.out.println("Enter Student Name: ");
	          String StudentName = scan.next();
	          if(passFail(scan)) {
	        	  System.out.println("Student : "+StudentName+ " with Id : "+studentNumber+" has Passed");
	          }else {
	        	  System.out.println("Student : "+StudentName+ " with Id : "+studentNumber+" has Failed");
	          }
	          System.out.println("=============================");
		}
          
	}
	static boolean passFail(Scanner scan) {
		boolean pass=true;
		
        int number_of_subjects=0, passMark=0;
        float sum=0;
        float avg, perc;
        //Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter number of Subjects : ");
        number_of_subjects = scan.nextInt();
        
        System.out.println("Enter pass marks for each subject : ");
        passMark = scan.nextInt();
        
        for(int i=0; i<number_of_subjects; i++)
        {
        	int subNumber=i+1;
        	System.out.println("Enter marks Obtained in Subject-"+subNumber+" :");
        	 int marks = scan.nextInt();
            sum = sum + marks;
            if(marks<passMark) {
            	pass=false;
            }
        }
		
        avg = sum/number_of_subjects;
        perc = (sum/(100*number_of_subjects)) * 100;
        
        System.out.println("Total Marks = " +sum);
		
        System.out.println("Average Marks = " +avg);
		
        System.out.println("Percentage = " +perc+ "%");
		
		return pass;
		
	}

}






























