package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development

   Циклы
   
2. Вычислить значения функции на отрезке [а,b] c шагом h:
   y = x, x > 2
   y = -x, x <= 2
*/
public class Solution13 {

	public static void main(String[] args) throws IOException {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("please enter the number a >>");
	String sA = reader.readLine();
	double a = Double.parseDouble(sA);

	System.out.println("please enter the number b >>");
	String sB = reader.readLine();
	double b = Double.parseDouble(sB);

	System.out.println("please enter the number h >>");
	String sH = reader.readLine();
	double h = Double.parseDouble(sH);
	
	double y = 0;
	
		for (double i = a; i <= b; i = i + h){ 
		
		if (a <= 2) {
			y = -a;
		} else if (a > 2) {
			y = a;
		}
		a = a + h; 
		System.out.print(y + " ");
		}

	}
}
