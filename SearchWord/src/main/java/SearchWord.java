import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.swing.text.html.parser.Entity;

public class SearchWord {

	public static void main(String[] args) {

		String Str = "Sc we would never be able to return to tell Lightman wanted to go public with what he believed was the real story Henry's father was no hero, and trust me, he does not need to know the real story";
		//String[] sarr = new String[] {"One","Two","Two","Two","Two","Two","Two","Two"};
		String[] sarr = Str.split(" ");
	//	Arrays.stream(sarr).forEach(System.out::println);
		Map<String,Integer> status = new HashMap<String,Integer>();

		Arrays.sort(sarr);
		int count = 0;
			for (int  i = 1 ; i < sarr.length; i++) {
				count = status.containsKey(sarr[i])? status.get(sarr[i]) : 1;
				if ( sarr[i-1].equals(sarr[i]))
				{
					status.put(sarr[i],++count);
				}
			}
			status.entrySet().stream().sorted(Collections.reverseOrder( Entry.comparingByValue())).forEach(System.out::println);
			//Map<String,Integer> list = status.entrySet().stream().sorted(Entry.comparingByValue()).collect(toMap(Entry::getKey, Entry::getValue, (a, b) -> a, LinkedHashMap::new));
			
			//status.entrySet().stream().sorted().collect(toImm);
			//System.out.println(list); 
	}

}
