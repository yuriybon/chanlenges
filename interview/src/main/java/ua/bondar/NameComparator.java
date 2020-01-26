package ua.bondar;
import java.util.TreeSet;

public class NameComparator {
	
	public static double compareWord(String word1,String word2) {
		double distance = 0.0;
		String part1;
		String part2;
		int gram = word1.length() < 5 || word2.length() < 5 ? 2 :3;
		int mn = 0;
		mn = word1.length()-gram+1;
		TreeSet<String> gramSet = new TreeSet<>();
		
		for (int i = 0 ; i < word1.length()-gram+1 && i+gram < word2.length() ; i++) {
				part1 = word1.subSequence(i, i+gram).toString();
				part2 = word2.subSequence(i, i+gram).toString();
			if ( !part1.equals(part2) ) {
				gramSet.add(part1);
			} else {
				distance = distance+gram; 
			}
		}
		for (int i = 0 ; i < word2.length()-gram+1 ; i++) {
			if (gramSet.contains(word2.subSequence(i, i+gram).toString()) ) {
				distance++;
			}
		}
		
		return distance/(mn*gram);

	}
	
	public static int getCountComparedWords(int countWord1 ,int countWord2) {
		if (countWord1 == countWord2)
			return countWord1;
		return countWord1 > countWord2 ? countWord2 : countWord1;
	}
	
	public static double compareName(String name1, String name2) {
		double res = name1 == name2 ?  1 : 0;
		int countEquals = 0;
		if (res == 1)
			return res;
		String[] words1 = name1.split(" ");
		String[] words2 = name2.split(" ");
		
		double weight = 1d/getCountComparedWords(words1.length, words2.length);
		
		for (int i = 0; i < words1.length; i++) {
			for (int j=0 ; j < words2.length; j++)
				if ( words1[i].compareTo(words2[j]) == 0 ) {
					res = res + weight;
					countEquals++;
				}
				else {
					if ( i == j ) {
						res = res + weight*compareWord(words1[i],words2[j]);
					}
				}
		}
		
		if (res > 0  && words1.length != words2.length) {
			int negWeight = words1.length > words2.length ? words1.length-words2.length : words2.length-words1.length;
			int maxCountWords = words1.length > words2.length ? words1.length : words2.length;
			res = res - (double) negWeight/(maxCountWords+countEquals);
		}
		return res;
	}
	
}
