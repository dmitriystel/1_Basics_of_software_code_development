package by.introduction.first.leaner1.main;
/*
1. Basics of sowtware code development

   Циклы
   
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
*/
public class Solution15 {

	public static void main(String[] args) {
		
		int res = 1;
		
		for (int i = 1; i <= 200; i++) {
			res *= Math.pow(i, 2);
		}
		System.out.print(res + " ");
	}
}
