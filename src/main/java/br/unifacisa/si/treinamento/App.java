package br.unifacisa.si.treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements Comand {
	public static void main(String[] args) 
	{
		SpringApplication.run(App.class, args);
	}

}
