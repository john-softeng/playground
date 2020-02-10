/**
 * 
 */
package jm.com.sandbox;

/**
 * @author John
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface  {
	
	void doSomething();
	
	
	default void doSomethingElse(String str) {
		System.out.println("Do something else with " + str);
	}
	
}
