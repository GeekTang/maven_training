package org.example.simple.internal;

import java.util.Dictionary;
import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import org.example.simple.ExampleService;

/**
 * Extension of the default OSGi bundle activator
 */
public final class ExampleActivator implements BundleActivator {
	private ServiceTracker exampleServiceTracker;

	/**
	 * Called whenever the OSGi framework starts our bundle
	 */
	public void start(BundleContext bc) throws Exception {
		System.out.println("STARTING org.example.simple client!");

		ExampleService example = null;
		if (example != null) {
			String input = "123456789";
			System.out.println("Reverse " + input + " ==>  "
					+ example.reverse(input));
		} else {
			System.out
					.println("Failed to get service org.example.simple.ExampleService!");
		}
	}

	/**
	 * Called whenever the OSGi framework stops our bundle
	 */
	public void stop(BundleContext bc) throws Exception {
		System.out.println("STOPPING org.example.simple client.");

		// no need to unregister our service - the OSGi framework handles it for
		// us
	}
}
