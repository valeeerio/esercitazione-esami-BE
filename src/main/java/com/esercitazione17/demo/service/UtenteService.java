package com.esercitazione17.demo.service;

import com.esercitazione17.demo.dto.UtenteDto;
import com.esercitazione17.demo.entity.Utente;

import java.util.List;

public interface UtenteService {
    String aggiungiUtente(UtenteDto utenteDto);
    boolean esisteUtente(String email, String nome);
    boolean autenticaUtente(String email, String password);
}
