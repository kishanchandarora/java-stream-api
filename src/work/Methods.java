package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		// filter(Predicate)
			// boolean valued function == Predicate
			// e -> { return true}
			// e -> e > 10
		List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		// map(Function)
		/* 
		 * each element operation
		 * 
		 * 
		 * */
		List<Integer> numbers = List.of(23, 4, 3, 5, 6, 8);
		List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		names.stream().forEach(e -> {
			System.out.println(e);
		});
		
		newNames.stream().forEach(System.out::println); // System.out::println, this is method reference
		
		// min, max, sorted
		numbers.stream().sorted().forEach(System.out::println);
		
		Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println(integer);
		
		Integer integer1 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(integer1);
	}
}
