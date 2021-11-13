package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Ветвления
   
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
   Определить, пройдет ли кирпич через отверстие.
*/
public class Solution10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a >>");	
		double a = Double.parseDouble(reader.readLine());
	
		System.out.println("b >>");
		String sB = reader.readLine();
		double b = Double.parseDouble(sB);
		
		System.out.println("x >>");
		double x = Double.parseDouble(reader.readLine());
	
		System.out.println("y >>");
		double y = Double.parseDouble(reader.readLine());
		
		System.out.println("z >>");
		double z = Double.parseDouble(reader.readLine());

		if ( ( (a > x) && (b > y) ) || ( (a > y) && (b > x) ) )  {
			System.out.println("кирпич пройдет через отверстие");
		} else if ( ( (a > x) && (b > z) ) || ( (a > z) && (b > x) ) ) {
			System.out.println("кирпич пройдет через отверстие");			
		} else if ( ( (a > y) && (b > z) ) || ( (a > z) && (b > y) ) ) {
			System.out.println("кирпич пройдет через отверстие");
		} else {
			System.out.println("кирпич не пройдет через отверстие");
		}
	}
}
