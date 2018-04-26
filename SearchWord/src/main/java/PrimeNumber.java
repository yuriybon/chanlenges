import java.math.BigInteger;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer myInt = 7;
		BigInteger bigInteger = BigInteger.valueOf(myInt);
		if (bigInteger.isProbablePrime((int) Math.log(myInt))) { 
				System.out.printf("The number %d is prime",myInt);
		} else {
			System.out.printf("The number %d is not prime",myInt);
		}
		System.out.println("");
	}

}
