package codesoft.tasks.task2;
import java.util.Scanner;

public class Grade_calculator {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of each subject");
		System.out.println("Language");
		int sub1marks = sc.nextInt();
		System.out.println("Maths");
		int sub2marks = sc.nextInt();
		System.out.println("Science");
		int sub3marks = sc.nextInt();
		
		int totmarks = sub1marks + sub2marks + sub3marks;
		double avgpercentage = totmarks/3;
		
		 System.out.println("Total Marks: " + totmarks);
	     System.out.println("Average Percentage: " + avgpercentage + "%");
    
		if(avgpercentage >= 90) 
		{
			System.out.println("Grade you got is A+");
		}
		else if(avgpercentage >= 80) 
		{
			System.out.println("Grade you got is A");
		}
		else if(avgpercentage >= 70) 
		{
			System.out.println("Grade you got is B");
		}
		else if(avgpercentage >= 60) 
		{
			System.out.println("Grade you got is c");
		}
		else if(avgpercentage >= 50) 
		{
			System.out.println("Grade you got is D");
		}
		else  
		{
			System.out.println("You are fail, better luck next time!");
		}


	}

}
