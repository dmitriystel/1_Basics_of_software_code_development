package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 1. Basics of sowtware code development
  
    Ветвления

5. Вычислить значение функции:
   F(x) = x² - 3x + 9, если x <= 3;
   F(x) = 1 / (x³ + 6), если x > 3.
*/
public class Solution11 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number x >>");
		String sX = reader.readLine();
		double x = Double.parseDouble(sX);
		
		if (x <= 3) {
			System.out.println("если x <= 3, ответ: " + (Math.pow(x, 2) - 3 * x + 9) );
		} else if (x > 3) {
			System.out.println("если x > 3, ответ: " + (Math.pow(x, 3) + 6) );			
		}
	}
}
