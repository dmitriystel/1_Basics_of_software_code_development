package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Ветвления
   
3. Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). 
   Определить, будут ли они расположены на одной прямой.
*/
public class Solution09 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("x1: >>");
		String sX1 = reader.readLine();
		double x1 = Double.parseDouble(sX1);
	
		System.out.println("y1: >>");
		String sY1 = reader.readLine();
		double y1 = Double.parseDouble(sY1);

		System.out.println("x2: >>");
		String sX2 = reader.readLine();
		double x2 = Double.parseDouble(sX1);
	
		System.out.println("y2: >>");
		String sY2 = reader.readLine();
		double y2 = Double.parseDouble(sY2);
		
		System.out.println("x3: >>");
		String sX3 = reader.readLine();
		double x3 = Double.parseDouble(sX3);
	
		System.out.println("y3: >>");
		String sY3 = reader.readLine();
		double y3 = Double.parseDouble(sY3);
		
		if ( (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1) ) {
			System.out.println("три точки будут расположены на одной прямой");
		} else System.out.println("три точки не будут расположены на одной прямой");
			
	}

}
