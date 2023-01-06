package kdn.spring.sample.springsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"kdn.spring.sample.springsample"})
public class SpringSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}

}
