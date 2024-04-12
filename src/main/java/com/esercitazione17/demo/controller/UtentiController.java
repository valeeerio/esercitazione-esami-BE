package com.esercitazione17.demo.controller;

import com.esercitazione17.demo.dto.UtenteDto;
import com.esercitazione17.demo.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
