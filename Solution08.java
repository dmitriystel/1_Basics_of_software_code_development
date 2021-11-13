package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Ветвления
   
2. Найти max{min(a,b), min(c,d)}.
*/
public class Solution08 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number a >>");
		String sA = reader.readLine();
		double a = Double.parseDouble(sA);
	
		System.out.println("please enter the number b >>");
		String sB = reader.readLine();
		double b = Double.parseDouble(sB);

		System.out.println("please enter the number c >>");
		String sC = reader.readLine();
		double c = Double.parseDouble(sC);
		
		System.out.println("please enter the number d >>");
		String sD = reader.readLine();
		double d = Double.parseDouble(sC);

		double min1;
		double min2;
		double max;
		
		if (a <= b) {
			min1 = a; 
		} else min1 = b;
		
		if (c <= d) {
			min2 = c;
		} else min2 = d;
		
		if (min1 > min2) {
			max = min1;
		} else max = min2;
		
		System.out.println("max{min(a,b), min(c,d): " + max);
	}
}
