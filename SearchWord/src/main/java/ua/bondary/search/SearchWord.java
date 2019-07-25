package ua.bondary.search;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SearchWord {

	public static void searchNestedLoops(String str) {
		String[] sarr = str.split(" ");
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
		System.out.println(status);
		System.out.println("-----");
		status.entrySet().stream().sorted(Collections.reverseOrder( Entry.comparingByValue())).forEach(System.out::println);
		System.out.println("-----");
		 
		status.entrySet().stream().forEach(System.out::println);
		
		System.out.println(status.entrySet().stream().findFirst().get().getKey());

	}

	public static Map<String,Long> getMap(String str) {
		return Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	public static void oneCoolMethod(String s) {

        Arrays.asList(s.split(" ")).stream()//.sorted()  //get List
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))  //List to Map with grouping and counting
                .entrySet().stream()            // Map to stream
                .filter(e -> e.getValue() > 1)  // filtering
                .forEach(System.out::println)   // output
                ;
	}



	public static void searchStreamNestedLoops(String str) {
//		Map<String,String> smap = Arrays.asList(str.split(" ")).stream()
//				.collect(Collectors.toMap());

		//List<String> s = new ArrayList<String>();

		List<String> list = Arrays.asList(str.split(" ")).stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		Map<String, List<String>> mapList = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.toList()));


//		List<String> smap = Arrays.asList(str.split(" ")).stream().collect(Collectors.toList());
//				//forEach(String::getBytes) ;
//
		System.out.println(map);
		System.out.println(mapList);
//		String[] sarr = str.split(" ");
//
//		Map<String,Integer> status = new HashMap<String,Integer>();
//
//		Arrays.sort(sarr);
//		int count = 0;
//		for (int  i = 1 ; i < sarr.length; i++) {
//			count = status.containsKey(sarr[i])? status.get(sarr[i]) : 1;
//			if ( sarr[i-1].equals(sarr[i]))
//			{
//				status.put(sarr[i],++count);
//			}
//		}
//		status.entrySet().stream().sorted(Collections.reverseOrder( Entry.comparingByValue())).forEach(System.out::println);
//		System.out.println("-----");
//		status.entrySet().stream().forEach(System.out::println);

	}


	public static void main(String[] args) {
  System.out.println("Test");
		String str = "Sc we would never be able to return to tell Lightman wanted to go public with what he believed was the real story Henry's father was no hero, and trust me, he does not need to know the real story";

		//searchNestedLoops(str);
//        oneCoolMethod(str);
//        Map<String,Long> map = getMap(str);
//        
        searchNestedLoops(str);
		//searchStreamNestedLoops(str);
		//String[] sarr = new String[] {"One","Two","Two","Two","Two","Two","Two","Two"};
		//Map<String,Integer> list = status.entrySet().stream().sorted(Entry.comparingByValue()).collect(toMap(Entry::getKey, Entry::getValue, (a, b) -> a, LinkedHashMap::new));
			
			//status.entrySet().stream().sorted().collect(toImm);
			//System.out.println(list); 
	}

}
