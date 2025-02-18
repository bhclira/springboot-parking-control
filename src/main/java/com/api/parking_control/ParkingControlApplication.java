package com.api.parking_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// bean do tipo controller
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá Mundo";

		// metodo com método HTTP
		// por baixo dos panos sempre que envia requisição faz um roteamento para qual controler vai enviar
		// a solicitação
		// configurar um endpoint para a porta destinada :8080 funcionar
	}


}
