package by.introduction.first.leaner1.main;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
     
   Линейные программы
  
1. Найдите значение функции:
   z = ((a - 3) * b / 2) + c;
*/
public class Solution01 {

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

		System.out.println("z = " + (((a - 3) * b / 2) + c));
	}
}
