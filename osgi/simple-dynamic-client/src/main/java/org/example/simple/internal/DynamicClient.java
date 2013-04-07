/**
 * 
 */
package org.example.simple.internal;

import org.example.simple.ExampleService;

/**
 * @author eweitan
 *
 */
public interface DynamicClient {
	
	void start(ExampleService reverseService);

	void stop(ExampleService reverseService);
}
