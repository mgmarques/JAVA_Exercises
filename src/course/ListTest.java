package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Marcio");
		list.add("Anna");
		list.add("Maria");
		list.add("Junior");
		list.add("Gladis");

		printList(list);
				
		list.remove("Maria");
		
		printList(list);
		
		list.add(2, "Silvia");
		printList(list);

		list.removeIf(x -> x.charAt(0) == 'M');
		printList(list);
		
		System.out.println("Index of Anna: " + list.indexOf("Anna"));
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		List<String> results = list.stream()
				.filter(x -> x.charAt(0) != 'A').collect(Collectors.toList());
		printList(results);
		
		String name = list.stream().filter(x -> x.charAt(0) != 'A').findFirst().orElse(null);
		System.out.println("First name started without 'A': " + name);
		System.out.println("-------------------------");

		name = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
		System.out.println("First name started with 'Z': " + name);
	}

	public static void printList(List<String> list) {
		System.out.println("-------------------------");
		for (String s: list ) {
			System.out.println(s);
		}
		
	}
}
