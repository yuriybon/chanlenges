package ua.bondar;

public class StrUtils {
	
	private static String reverse(String s) {
		final StringBuilder sb = new StringBuilder(s.length());
		for (int i = s.length()-1; i>=0 ; i--)
			 sb.append(s.charAt(i));
		return sb.toString();
	}

	public static String inPlaceReverse(final String s) {
	    final StringBuilder builder = new StringBuilder(s);
	    for (int i = 0; i < builder.length() / 2; i++) {
	        final char tmp = builder.charAt(i);
	        final int otherEnd = builder.length() - i - 1;
	        builder.setCharAt(i, builder.charAt(otherEnd));
	        builder.setCharAt(otherEnd, tmp);
	    }
	    return builder.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "treehdsls;";
		System.out.println(reverse(s));
		System.out.println(inPlaceReverse(s));
	}

}
