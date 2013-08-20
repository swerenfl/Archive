package com;

import java.util.*;


class SpaceRemover
{
	public static void main(String[] args)
	{
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		char[] mfl = mostFamous.toCharArray();
		
		for (int dex = 0; dex < mfl.length; dex++)
		{
			char current = mfl[dex];
			if (current != ' ')
			{
				System.out.print(current);
			}
			else
			{
				System.out.print('.');
			}
		}
		
//		Arrays.sort(mfl);
//		for (int i = 0; i < mfl.length; i++)
//		{
//			System.out.println(i + ": " + mfl[i] + " ");
//		}
		
		System.out.println();
	}
}
