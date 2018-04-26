package ua.bondar.common;

public class StdRandom {
	
	public static void shuffle(int[] a) {
		//int lenght = (int) (Math.random()*10);
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*10);
		}
		
		
	}

}
