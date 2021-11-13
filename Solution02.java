package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
    
   Линейные программы
   
2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
   ((b + sqrt(b^2 + 4* a * c))/(2 * a)) - a^3 * c + (1/b^2)
*/
public class Solution02 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number a >>");
		double a = Double.parseDouble(reader.readLine());
	
		System.out.println("please enter the number b >>");
		double b = Double.parseDouble(reader.readLine());

		System.out.println("please enter the number c >>");
		double c = Double.parseDouble(reader.readLine());

		System.out.println("result is: ");
		System.out.println( (b + (Math.sqrt ((Math.pow(b, 2)) +  4 * a * c)) ) / 
				2 * a - Math.pow(a, 3) * c + Math.pow(b, -2) );
	}

}
