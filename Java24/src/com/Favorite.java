package com;

class Favorite
{
	public static void main(String[] args)
	{
		String favorite = "piano";
		String guess = "piano";
		System.out.println("Is Ada's favorite intrument a " + guess + "?");
		System.out.println("Answer: " + favorite.equals(guess));
	}
}
