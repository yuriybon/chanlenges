import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {

	public static void printList() {
		List<Integer> list = Stream.of(4,3,5).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> streamFromValues = Stream.of(4, 5, 3);
		List<Integer> list = streamFromValues.sorted().collect(Collectors.toList());
		System.out.println(list);

		printList();

	}

}
