package com.cloud.proxy.Gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
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

