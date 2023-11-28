package br.com.gm2.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {SpringApplication.run(Demo1Application.class, args);}

	@GetMapping("/inicio")
	public String inicio() {
		return "ola Spring";
	}
}
