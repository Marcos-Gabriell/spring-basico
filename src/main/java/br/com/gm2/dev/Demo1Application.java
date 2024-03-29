package br.com.gm2.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	@Autowired
	private AppConfiguaration appConfiguaration;

	/*
	public Demo1Application(AppConfiguaration appConfiguaration) {

		this.appConfiguaration = appConfiguaration;

	}*/

	@Value("${app.message}")
	private String message;

	public static void main(String[] args) {SpringApplication.run(Demo1Application.class, args);}

	@GetMapping("/inicio2")
	public String inicio() {
		return message;
	}
	@GetMapping("/configuracao")
	public String config() {
		return appConfiguaration.getMessage();
	}
}
