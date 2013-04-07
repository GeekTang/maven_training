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
	}

	/* (non-Javadoc)
	 * @see org.example.simple.internal.DynamicClient#stop(org.example.simple.ExampleService)
	 */
	public void stop(ExampleService reverseService) {
		System.out.println("Reverse service stopped !");
	}

}
