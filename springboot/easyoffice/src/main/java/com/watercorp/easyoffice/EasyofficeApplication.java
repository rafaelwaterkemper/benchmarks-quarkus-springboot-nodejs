package com.watercorp.easyoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyofficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyofficeApplication.class, args);

		//Incluído para medir o tempo do startup com o comando time do linux
		System.exit(0);
	}

}