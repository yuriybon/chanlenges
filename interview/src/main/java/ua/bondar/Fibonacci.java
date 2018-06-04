package ua.bondar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
	
	public static List<Integer> fibonacci(int n) {
		if (n < 0) {
	        throw new IllegalArgumentException(
	                "n must not be less than zero");
	    }

	    if (n == 0) {
	        return new ArrayList<>();
	    }
	    if (n == 1) {
	        return Arrays.asList(0);
	    }

	    if (n == 2) {
	        return Arrays.asList(0, 1);

	    }
	    final List<Integer> seq = new ArrayList<>(n);
	    seq.add(0, 0);
	    seq.add(1, 1);
	    for (int i = 2; i<n ;i++) {
	    seq.add(seq.get(i-1)+seq.get(i-2));	
	    }
	    
	    return seq;
	}

	public static List<Long> fibonacciShort(int n) {
		if (n < 0)
		   throw new IllegalArgumentException("should be >= zero");
		final List<Long> result = new ArrayList<>();
		switch (n) {
		case 0:
			break;
		case 1:	
			result.add(Long.valueOf(0));
			break;
		default: 
			result.add(Long.valueOf(0));
			result.add(Long.valueOf(1));
		    for (int i = 2; i<n ;i++) {
		    result.add(result.get(i-1)+result.get(i-2));	
		    }
		}
		return result;
	}	
	
	public static Long getValueOfFibonacci(int n) {
		if (n < 0)
		   throw new IllegalArgumentException("should be >= zero");
		Long result = 0L, a = 0L, b = 1L;
		switch (n) {
		case 0: break;
		case 1: result = b; break;
		default: n = n-2;
			while ( n > 0 ) {
				result = b+a;
				a = b;
				b = result;
				n--;
			}
		}
		return result;
	}	
	
		
	
	public static int fibN(int n) {
	     if (n < 0) {
	         throw new IllegalArgumentException(
	                 "n must not be less than zero");
	     }
	     if (n == 1) return 1;
	     if (n == 0) return 0;
	     return (fibN(n - 1) + fibN(n - 2));
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fibonacci(10));
		System.out.println(fibonacciShort(30));
//		List l = fibonacciShort(40);
//		System.out.println(l.get(l.size()-1));
		final int res = 514229;
		System.out.println(res);
		//System.out.println(fibN(100));
		//1134903170
		System.out.println(getValueOfFibonacci(45));
	}
	

}
