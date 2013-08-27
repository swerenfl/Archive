package com;

//My answer
class Thirteens 
{
    public static void main(String arguments[]) 
    {
    	int[] Thirteens = new int[400];
        System.out.println("First 400 multiples of 13:");
        for (int i = 0; i < Thirteens.length; i++)
        {
        	Thirteens[i] = ((i+1)*13);
        	System.out.print(Thirteens[i]+ " ");
        }
    }
}

// Actual answer
// class ThirteenStorer {
//    public static void main(String arguments[]) {
//        int[] thirteens = new int[400];
//        int numFound = 0;
//        // candidate: the number that might be a multiple
//        // of 13
//        int candidate = 1;
//        System.out.println("First 400 multiples of 13:");
//        while (numFound < 400) {
//            if (candidate % 13 == 0) {
//                thirteens[numFound] = candidate;
//                numFound++;
//            }
//            candidate++;
//        }
//        System.out.println("First 400 multiples of 13:");
//        for (int i = 0; i < 400; i++) {
//           System.out.print(thirteens[i] + " ");
//        }
//    }
// }
