package ua.bondar;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	final static String FIZZBUZZ = "FizzBuzz";
	final static String FIZZ = "Fizz";
	final static String BUZZ = "Buzz";
	final static String EMPTY = "";


	public static List<String> fizzBuzz(final int n) {
	    final List<String> toReturn = new ArrayList<>(n);
	    for (int i = 1; i <= n; i++) {
	        if(i % 15 == 0) {
	            toReturn.add(FIZZBUZZ);
	        } else if (i % 3 == 0) {
	            toReturn.add(FIZZ);
	        } else if (i % 5 == 0) {
	            toReturn.add(BUZZ);
	        } else {
	            toReturn.add(Integer.toString(i));
	        }
	    }

	    return toReturn;
	}
	
	//private static String toWord() {}
	public static List<String> alternativeFizzBuzz(final int n) {
	    final List<String> toReturn = new ArrayList<>(n);
	    for (int i = 1; i <= n; i++) {
	        final String word =
	                toWord(3, i, FIZZ) + toWord(5, i, BUZZ);

	        if(word.equals(EMPTY)) {
	            toReturn.add(Integer.toString(i));
	        }
	        else {
	            toReturn.add(word);
	        }
	    }
	    return toReturn;
	}
	

	public static List<String> alternativeFizzBuzzShort(final int n) {
	    final List<String> toReturn = new ArrayList<>(n);
	    String word;
	    for (int i = 1; i <= n; i++) {
	        word = (i%3 == 0 ? FIZZ : EMPTY) 
	        		+ (i%5 == 0 ? BUZZ : EMPTY);
	        if(word.equals(EMPTY)) {
	            toReturn.add(Integer.toString(i));
	        }
	        else {
	            toReturn.add(word);
	        }
	    }
	    return toReturn;
	}
	
	private static String toWord(int divisor, int value, String template) {
		return value%divisor == 0 ? template: EMPTY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( fizzBuzz(20));
		System.out.println( alternativeFizzBuzz(20));
		System.out.println(alternativeFizzBuzzShort(20));
	}

}
