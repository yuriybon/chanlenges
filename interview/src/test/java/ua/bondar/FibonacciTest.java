package ua.bondar;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import ua.bondar.Fibonacci;
public class FibonacciTest {

	@Test
	public void fibonacciList() {
	    assertEquals(0, Fibonacci.fibonacci(0).size());
	    assertEquals(Arrays.asList(0), Fibonacci.fibonacci(1));
	    assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacci(2));
	    assertEquals(Arrays.asList(0, 1, 1), Fibonacci.fibonacci(3));
	    assertEquals(Arrays.asList(0, 1, 1, 2), Fibonacci.fibonacci(4));
	    assertEquals(Arrays.asList(0, 1, 1, 2, 3), Fibonacci.fibonacci(5));
	    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), Fibonacci.fibonacci(6));
	    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacci(7));
	    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), Fibonacci.fibonacci(8));
	}

	@Test
	public void TestFibonacciShortList() {
//		try {
//			Fibonacci.fibonacciShort(-1);
//		}
//		catch (Exception e) {
//			assertEquals(IllegalArgumentException.class,e.getClass());
//		}		
//	    assertEquals(0, Fibonacci.fibonacciShort(0).size());
//	    assertEquals(Arrays.asList(0), Fibonacci.fibonacciShort(1));
//	    assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacciShort(2));
//	    assertEquals(Arrays.asList(0, 1, 1), Fibonacci.fibonacciShort(3));
//	    assertEquals(Arrays.asList(0, 1, 1, 2), Fibonacci.fibonacciShort(4));
//	    assertEquals(Arrays.asList(0, 1, 1, 2, 3), Fibonacci.fibonacciShort(5));
//	    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), Fibonacci.fibonacciShort(6));
//	    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacciShort(7));
//	    assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), Fibonacci.fibonacciShort(8));
	}
}
