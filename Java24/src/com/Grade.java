package com;

import java.util.Scanner;

class Grade
{
	public static void main(String[] args)
	{
		
//		Prompting user for grade
		Scanner user_input = new Scanner(System.in);
		int grade;
		System.out.print("Enter the grade: ");
		grade = user_input.nextInt();

//		If statement
		if (grade >= 100)
		{
			System.out.println("You have an A+. Superb job!");
		}
		else if (grade >= 90)
		{
			System.out.println("You have an A. Good job!");
		}
		else if (grade >= 80)
		{
			System.out.println("You have a B. Decent job!");
		}
		else if (grade >= 70)
		{
			System.out.println("You have a C. Average job!");
		}
		else if (grade >= 60)
		{
			System.out.println("You have a D. Better luck next time!");
		}
		else
		{
			System.out.println("You have a F. See you next year!");
		}
		
//		Close Scanner
		user_input.close();
	}
}
