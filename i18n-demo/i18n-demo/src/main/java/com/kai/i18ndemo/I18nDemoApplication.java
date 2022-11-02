package com.kai.i18ndemo;

import com.kai.i18ndemo.config.AcceptHeaderResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class I18nDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(I18nDemoApplication.class, args);
	}

	@Bean
	public AcceptHeaderResolver localeResolver() {
		return new AcceptHeaderResolver();
	}


}
