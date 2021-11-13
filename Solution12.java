package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Basics of sowtware code development

   Циклы
	  
1. Напишите программу, где пользователь вводит любое целое положительное число. 
   А программа суммирует все числа от 1 до введенного пользователем числа. 
*/
public class Solution12 {
	
		public static void main(String[] args) throws IOException {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("please enter the number n >>");
			String sN = reader.readLine();
			int n = Integer.parseInt(sN);
			
			int res = 0;
			
			for (int i = 1; i <= n; i++ ) {
				res += i;
			}
			 System.out.println(res);			
		}
}



