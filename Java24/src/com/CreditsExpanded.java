package com;

class CreditsExpanded
{
	public static void main(String[] args)
	{
		//set up film information
		String title = "The Piano";
		int year = 1993;
		String director = "Jane Campion";
		String role1 = "Ada";
		String actor1 = "Holly Hunter";
		String role2 = "Baines";
		String actor2 = "Harvey Keitel";
		String role3 = "Stewart";
		String actor3 = "Sam Neill";
		String role4 = "Flora";
		String actor4 = "Anna Paquin";
		
		//set up upper case
		String dirUp = director.toUpperCase();
		String act1Up = actor1.toUpperCase();
		String act2Up = actor2.toUpperCase();
		String act3Up = actor3.toUpperCase();
		String act4Up = actor4.toUpperCase();
		
		//display information
		System.out.println(title + " (" + year + ")\n" +
				"A " + dirUp + " film.\n\n" +
				role1 + "\t" + act1Up + "\n" +
				role2 + "\t" + act2Up + "\n" +
				role3 + "\t" + act3Up + "\n" +
				role4 + "\t" + act4Up
		);
	}
}
