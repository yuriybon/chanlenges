import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> streamFromValues = Stream.of(4, 5, 3);
		List<Integer> list = streamFromValues.sorted().collect(Collectors.toList());
		System.out.println(list);

	}

}
