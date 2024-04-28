package com.infosys.infytel.calldetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class CallDetailsApplication  extends SpringBootServletInitializer {
	
	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(CallDetailsApplication.class);
	   }
	 //this is a comment
	public static void main(String[] args) {
		SpringApplication.run(CallDetailsApplication.class, args);
	}
}
