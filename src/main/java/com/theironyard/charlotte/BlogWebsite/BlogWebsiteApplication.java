package com.theironyard.charlotte.BlogWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = {
		BlogWebsiteApplication.class, Jsr310JpaConverters.class
		//including second class for datetime objects to have column types created.
})

@SpringBootApplication
public class BlogWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogWebsiteApplication.class, args);
	}
}
