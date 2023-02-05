package co.ak.kubernetes.spring.java.propertywatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PropertywatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertywatchApplication.class, args);
	}

}
