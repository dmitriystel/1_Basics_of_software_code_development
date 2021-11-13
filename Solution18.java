package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development

   Циклы
   
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы 
   и самого числа.
   m и n вводятся с клавиатуры.
*/
public class Solution18 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number m >>");
		int m = Integer.parseInt(reader.readLine());
		
		System.out.println("please enter the number n >>");
		int n = Integer.parseInt(reader.readLine());
				
		for (int j = m; m < n; m++) {
			for (int i = 2; i < m; i++) {
				if (m % i == 0) {

					System.out.println("for " + m + " the devisor is " + i);
				}
			}
		}		
	}
}
