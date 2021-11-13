package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development

   Циклы 
   
5. Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, 
   модуль которых больше или равен заданное e. Общий член ряда имеет вид: 
   a n (n подстрочная) = 1 /2ⁿ + 1/3ⁿ
*/
public class Solution16 {

	public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("please enter the number e >>");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double e = Double.parseDouble(reader.readLine());
        
        double res = 0;
  
        for (int i = 0; i <= 10; i++)
         {
        	double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        	if (Math.abs(a) >= e) {
        		res += a; 
        	}
        }
        System.out.println(res);		
	}
}
