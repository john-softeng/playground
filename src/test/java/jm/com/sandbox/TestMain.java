/**
 * 
 */
package jm.com.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author John
 *
 */
public class TestMain {


	@Test
	public void helloWorldTest() {
		// TODO Auto-generated method stub
		
		try {
		System.out.println("Hello World");
		} catch(Exception e) {
			
		} finally {
			
		}
		

	}

	
	@Test
	public void streamExample() {
		
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
	}
}
