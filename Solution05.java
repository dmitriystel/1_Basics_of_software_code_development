package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Basics of sowtware code development
  
   Линейные программы
         
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
   Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
   ННч ММмин SSc.
 */
public class Solution05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number T >>");
		int t = Integer.parseInt(reader.readLine());
		
		int hours = t / 3600;
		int minutes = (t - (hours * 3600)) / 60;
		int seconds = t - (hours * 3600 ) - (minutes * 60);
		
		System.out.println(hours + "h " + minutes + "min " + seconds + "sec" );
	}

}
