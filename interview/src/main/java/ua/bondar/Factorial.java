package ua.bondar;

public class Factorial {
	
	public static long factorial(int n) {
	    if (n < 1) {
	        throw new IllegalArgumentException(
	                "n must be greater than zero");
	    }

	    long toReturn = 1;
	    for (int i = 1; i <= n; i++) {
	        toReturn *= i;
	    }

	    return toReturn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(6));
	}

}
