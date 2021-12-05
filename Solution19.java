package by.introduction.first.leaner1.main;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
1. Basics of sowtware code development

     Циклы
   
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
*/
public class Solution19 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("please enter the number m >>");
		int m = Integer.parseInt(reader.readLine());
		
		System.out.println("please enter the number n >>");
		int n = Integer.parseInt(reader.readLine());
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();		
		ArrayList<Integer> res = new ArrayList<Integer>();	
		
		do{
		    arr1.add(m % 10);
		    m /= 10;
		} while  (m > 0);
		

		do{
		    arr2.add(n % 10);
		    n /= 10;
		} while  (n > 0);
		
		
		for(int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if ( arr1.get(i) == arr2.get(j) ) {
					res.add(arr2.get(j));
		}				
	}
}
	       for (int elem : res) {
	           System.out.println(elem);			
	    }
	}
}

