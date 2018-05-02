package com.socgen.recovery.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

	/**
	 * Register JAX-RS application components.
	 */
	public ApplicationConfig() {
		// register applicationBinder
		register(new ApplicationBinder());

		// register features
		register(JacksonFeature.class);

		packages(true, "com.socgen.recovery");
	}

}
