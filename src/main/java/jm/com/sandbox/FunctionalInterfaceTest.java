/**
 * 
 */
package jm.com.sandbox;

import java.util.function.Function;

/**
 * @author John
 *
 */
public class FunctionalInterfaceTest {

	
	
	
	public void java8FunctionInterfaces() {
		
		
		Function<String, String> myConcat = a -> a + " world";
		myConcat.apply("Hello");
		System.out.println("concatentation function: " + myConcat.apply("Hello"));
		
		
		Function<Integer, String> intToString = Object::toString;
		intToString = a -> String.valueOf(a);
		System.out.println("Int to String: " + intToString.apply(11));
		
	}
	
	
	public void myFunctionalInterface() {
		
		MyFunctionalInterface mfit = () -> System.out.println("print something");
		mfit.doSomething();
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
	}

}
	