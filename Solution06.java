package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Линейные программы
   
6. Для данной области составить линейную программу, которая печатает true, если точка с 
   координатами (х, у) принадлежит закрашенной области, и false — в противном случае
 */
public class Solution06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter x >>");
		int x = Integer.parseInt(reader.readLine());
	
		System.out.println("please enter y >>");
		int y = Integer.parseInt(reader.readLine());
		
		System.out.println( 
				
				((0 <= x && x <= 2) && (0 <= y &&  y <= 4)) ||
				((-2 <= x && x <= 0) && (0 <= y &&  y <= 4)) ||
				((-4 <= x && x <= 0) && (-4 <= y &&  y <= 0)) ||
				((0 <= x && x <= 4) && (-3 <= y &&  y <= 0))
				
			);
	}
}
