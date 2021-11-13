package by.introduction.first.leaner1.main;

public class Solution14 {
/*
1. Basics of sowtware code development

   Циклы
   
3. Найти сумму квадратов первых ста чисел.
*/
	public static void main(String[] args) {
		
		int res = 0;
		
		for (int i = 0; i <= 100; i++) {
			res += Math.pow(i, 2);
		}
		System.out.println(res);
	}
}
