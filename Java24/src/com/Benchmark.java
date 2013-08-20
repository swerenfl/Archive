package com;

import java.util.*;

class Benchmark
{
	public static void main(String[] args)
	{
		Calendar start = Calendar.getInstance();
		int startMinute = start.get(Calendar.MINUTE);
		int startSecond = start.get(Calendar.SECOND);
		start.roll(Calendar.MINUTE, true);
		int nextMinute = start.get(Calendar.MINUTE);
		int nextSecond = start.get(Calendar.SECOND);
		int index = 0;
		
		while (true)
		{
			double x = Math.sqrt(index);
//			double y = (9 * 9); Activity 1 Hour 8
			GregorianCalendar now = new GregorianCalendar();
			if (now.get(Calendar.MINUTE) >= nextMinute)
			{
				if (now.get(Calendar.SECOND) >= nextSecond)
				{
					break;
				}
			}
			
			index++;
		}
		
		System.out.println(index + " loops in one minute.");
	}
}
