package com.demo02;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo02Application {

	@RequestMapping("/")
	public String index(){
		return "Hello SpringBoot";
	}

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(Demo02Application.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);

	}
}
