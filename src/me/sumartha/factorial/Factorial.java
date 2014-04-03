package me.sumartha.factorial;

public class Factorial {

	public float getFactorialOf(int number) {
		if (number <= 2) {
			return 1;
		} else {
			// 3! = 3 x 2 x 1
			float sum = 1;
			for (int i = number; i >=1; i--) {
				sum *= i;
				System.out.println("SUM *" + sum);
			}
			
			return sum;
		}
	}
}
