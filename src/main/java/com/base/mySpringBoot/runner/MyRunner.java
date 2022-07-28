package com.base.mySpringBoot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner{

	private Environment environment;

	// constructor injection
	public MyRunner(Environment environment) {
		this.environment = environment;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Priperty Value : " + environment.getProperty("myboot.name"));
		System.out.println("VM arguments : " + args.containsOption("foo"));
		System.out.println("Application arguments : " + args.containsOption("bar"));
	}
	
	

}
