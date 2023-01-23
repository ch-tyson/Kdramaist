package dev.ch_tys.kdramas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class KdramasApplication {

	public static void main(String[] args) {
		SpringApplication.run(KdramasApplication.class, args);
	}

	

}
