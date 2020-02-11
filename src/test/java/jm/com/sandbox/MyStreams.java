/**
 * 
 */
package jm.com.sandbox;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author John
 *
 */
public class MyStreams {
	
	
	
	
	@Test
	public void streamTest1() {
		
		List<String> nameList = getNameList();
		
		nameList.stream().forEach(System.out::println);
		
		System.out.println("\n");
		
		// sorted - by natural order
		// sequential
		// What's the difference?
		nameList.stream().sorted().sequential().forEach(System.out::println);
		System.out.println("\n");
		
		// distinct - 
		// sorted - 
		// collect - results returned to a new list
		List<String> newList = nameList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Same list?  " + (nameList == newList));
        // Print the new list
		newList.forEach(System.out::println);
		System.out.println("\n");
		
		// filter - include all strings with the letter "o"
		// then print
		nameList.stream().filter(a -> a.contains("o")).forEach(System.out::println);
		System.out.println("\n");
		
		
        // filter - include all strings with the letter "o"
		// collect - return a set (note that a set contains unique values.
		Set<String> set = nameList.stream().filter(a -> a.contains("o")).collect(Collectors.toSet());
		set.stream().forEach(System.out::println);
		System.out.println("\n");

	
		// joining - creates a string from the list and adds a "|" (delimiter) between each
		String delimitedList = nameList.stream().collect(Collectors.joining("|"));
		System.out.println(delimitedList);
		

	}

	
	
	private List<String> getNameList() {
		
		return Arrays.asList("John", "Mike", "Dan", "Tom", "Joanne", "Elizabeth", "Tom");
	}
}
