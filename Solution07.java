package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Basics of sowtware code development
  
   Ветвления
  
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
   и если да, то будет ли он прямоугольным.
 */
public class Solution07 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the first corner of the triangle a >>");
		String sA = reader.readLine();
		double a = Double.parseDouble(sA);
	
		System.out.println("please enter the second corner of the triangle b >>");
		String sB = reader.readLine();
		double b = Double.parseDouble(sB);
		
		if ((a + b) >= 180) {
			System.out.println("triangle doesn't exist");
		} else if ((a + b) == 90) {
			System.out.println("rectangular triangle");				
		} else {
			System.out.println("non-rectangular triangle");			
		}
	}
}
