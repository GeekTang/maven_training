/**
 * 
 */
package org.example.simple.internal;

import org.example.simple.ExampleService;

/**
 * @author eweitan
 *
 */
public class DynamicClientImpl implements DynamicClient {

	/* (non-Javadoc)
	 * @see org.example.simple.internal.DynamicClient#start(org.example.simple.ExampleService)
	 */
	public void start(ExampleService reverseService) {
		System.out.println("Reverse service started !");
		String input = "DY 121212";
		System.out.println("Reverse " + input + " ==> " + reverseService.reverse(input));
	}

	/* (non-Javadoc)
	 * @see org.example.simple.internal.DynamicClient#stop(org.example.simple.ExampleService)
	 */
	public void stop(ExampleService reverseService) {
		System.out.println("Reverse service stopped !");
		String input = "STOP 121212";
		System.out.println("Reverse " + input + " ==> " + reverseService.reverse(input));
	}

}
