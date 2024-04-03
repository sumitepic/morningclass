package update;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamclass {

		
		public static void main(String[] args) {
	
	//List<Integer> lit1= List.of(2,3,4,5,6,7);
	
	List<Integer> list=Arrays.asList(23,3,4,5,6);
	
	
	Stream<Integer> stream=list.stream();
	
	list.stream().mapToLong(Integer :: longValue)
    .filter(num -> (num * num) * 2 == 50)
    .forEach(System.out::println);
	
	}
	
}
