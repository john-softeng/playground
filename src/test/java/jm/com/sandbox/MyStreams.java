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
		
		nameList.stream().sorted().sequential().forEach(System.out::println);
		System.out.println("\n");
		
		List<String> newList = nameList.stream().distinct().sorted().collect(Collectors.toList());
		newList.forEach(System.out::println);
		System.out.println("\n");
		
		
		nameList.stream().filter(a -> a.contains("o")).forEach(System.out::println);
		System.out.println("\n");
		
		
		Set<String> set = nameList.stream().filter(a -> a.contains("o")).collect(Collectors.toSet());
		set.stream().forEach(System.out::println);
		System.out.println("\n");

	
		String delList = nameList.stream().collect(Collectors.joining("|"));
		System.out.println(delList);
		

	}

	
	
	private List<String> getNameList() {
		
		return Arrays.asList("John", "Mike", "Dan", "Tom", "Joanne", "Elizabeth", "Tom");
	}
}
