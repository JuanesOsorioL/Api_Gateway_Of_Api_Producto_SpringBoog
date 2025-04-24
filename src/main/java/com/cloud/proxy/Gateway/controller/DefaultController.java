package com.cloud.proxy.Gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = {
        "http://127.0.0.1:5501",
        "http://localhost:5501",
        "http://localhost:8282/api/productos",
        "http://localhost:8282"
})
public class DefaultController {

    @RequestMapping("/default")
    public ResponseEntity<Map<String, String>> Default() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of(
                        "Error", "Servicio temporalmente fuera de línea",
                        "Mensaje", "Nuestro microservicio de productos está descansando. Intenta de nuevo en unos minutos."
                ));
    }
}

