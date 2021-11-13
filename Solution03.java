package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Линейные программы
   
3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
   (sin x + cos y / cos x - sin y ) * tg * x * y
*/
public class Solution03 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter x");
		String sX = reader.readLine();
		double x = Double.parseDouble(sX);
	
		System.out.println("please enter y");
		String sY = reader.readLine();
		double y = Double.parseDouble(sY);

		System.out.println("please enter tg");
		String sTg = reader.readLine();
		double tg = Double.parseDouble(sTg);
		
		System.out.println( ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * tg * x *y ) ;

	}

}
