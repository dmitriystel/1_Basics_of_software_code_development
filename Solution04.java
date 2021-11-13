package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Линейные программы
   
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
   Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/
public class Solution04 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number a >>");
		String sA = reader.readLine();
		double a = Double.parseDouble(sA);
		
		int fractionalPart = (int)a;

		double wholePart = (a - fractionalPart) * 1000 ;
		int wholePart_in_int = (int)(Math.round(wholePart));
		
	    System.out.printf("%d.%d\n ", wholePart_in_int, fractionalPart);
	}

}
