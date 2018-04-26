package ua.bondar.methods;

public class Quick  {
	
	public Quick() {  
		int len = (int) Math.random()*100;
	}
	
	
public void sort(Comparable[] a) {
	// TODO Auto-generated method stub
	sort(a,0,a.length-1);
}

public static void sort(Comparable[] a, int lo, int hi) {
	if (hi <= lo) return;
	int j = partition(a,lo,hi);
	sort(a, lo, j-1);
	sort(a,j+1, hi);
	
}

private static int partition(Comparable[] a, int lo, int hi) {
	// TODO Auto-generated method stub
	int i = lo, j = hi+1;
	Comparable v = a[lo];
	while (true) {
		while (less(a[++i],v)) if (i == hi) break;
		while (less(v,a[--j])) if (j == lo) break;
		if (i >= j) break;
		exch(a,i,j);
	}
	exch(a,lo,j);
		
	return j;
}



private static void exch(Comparable[] a, int i, int j) {
	// TODO Auto-generated method stub
	Comparable temp = a[j];
	a[j] = a[i];
	a[i] = temp;
	
}


private static boolean less(Comparable i, Comparable v) {
	return i.compareTo(v) < 0;
}


public void show(Comparable[] a) {
	// TODO Auto-generated method stub
	for (Comparable i : a) {
		System.out.println(i);
	}
}


public static void main(String[] args) {
	Quick q = new Quick();
	System.out.println("test");

	String[] arr = new  String[] {"frst","second","thrid","app"}; 
	q.sort(arr);
	q.show(arr);
}


}
