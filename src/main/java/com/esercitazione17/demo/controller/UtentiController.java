package com.esercitazione17.demo.controller;

import com.esercitazione17.demo.dto.UtenteDto;
import com.esercitazione17.demo.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/utente")
public class UtentiController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/registrazioni")
    public String aggiungiUtente(@RequestBody UtenteDto utenteDto) {
        return utenteService.aggiungiUtente(utenteDto);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UtenteDto utenteDto) {
        String email = utenteDto.getEmail();
        String password = utenteDto.getPassword();

        boolean autenticato = utenteService.autenticaUtente(email, password);
        if (autenticato) {
            return ResponseEntity.ok("Login effettuato con successo!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenziali non valide");
        }
    }
}


