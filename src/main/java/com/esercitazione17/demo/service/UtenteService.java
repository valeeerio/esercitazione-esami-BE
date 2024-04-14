package com.esercitazione17.demo.service;

import com.esercitazione17.demo.dto.UtenteDto;
import com.esercitazione17.demo.entity.Utente;

import java.util.List;

public interface UtenteService {
    String aggiungiUtente(UtenteDto utenteDto);

    boolean esisteUtente(String email);

    boolean autenticaUtente(String email, String password);
}
