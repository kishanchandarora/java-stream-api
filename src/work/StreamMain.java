package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		// q) create a list and filter all even numbers from list
		List<Integer> list1 = List.of(2, 3, 45, 67, 54, 68); // immutable
//		list1.add(45); // cause error
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		List<Integer> list3 = Arrays.asList(23, 45, 56, 67, 34, 685); // immutable

		// list2
		// without stream api
		List<Integer> listEven = new ArrayList<Integer>();
		for (Integer i: list1) {
			if (i % 2 == 0)
				listEven.add(i);
		}
		
//		System.out.println(list1);
//		System.out.println(listEven);
		
		// using stream api
//		Stream<Integer> stream = list1.stream(); // Stream is an interface
//		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(newList);
		
		List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		
		System.out.println(list1.stream().filter(i -> i > 10).collect(Collectors.toList()));
	}
}
