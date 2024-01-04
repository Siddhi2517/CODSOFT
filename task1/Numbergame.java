package codesoft.tasks.task1;

import java.util.Scanner;
import java.util.Random;

public class Numbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int minRange = 1;
        int maxRange = 20;
        int maxAttempts = 5;
        int score = 0;
        
        System.out.println("welcome to number guessing game");
        
        do{
        	int targetnum = ra.nextInt(maxRange - minRange + 1) + minRange;
        	int attempts = 0;
        	boolean guesscorrectly = false;
        	System.out.println("I have generated number between " + minRange + " and " + maxRange + " try to guess!"); 
        	
        	while(attempts < maxAttempts && !guesscorrectly)
        	{
        		System.out.println("Enter your guess : ");
        		int guess = sc.nextInt();
        		attempts++;
        		
        		if(guess == targetnum) 
        		{
        			System.out.println("Congrats! you guessed the correct number in" + attempts + "attempts.");
        			guesscorrectly = true;
        			score = score + maxAttempts - attempts +1;
        		}
        			else if (guess < targetnum) 
        			{
        				System.out.println("Guess is smaller than the actual number, try again");
        			}
        			else 
        			{
        				System.out.println("Guess is greater than the actual number , try again");
       			}
        	
        }
        	if (!guesscorrectly) 
    		{
    			System.out.println("You have reached the maximum number of attempts. correct number was " + targetnum);
    		}
    		System.out.println("Do you want to play again ?(yes/no): ");
	 	
       
     }while(sc.next().equalsIgnoreCase("yes"));
       
     System.out.println("Thanks for playing! Your total score is: " + score);
      sc.close();
     
	}

}
