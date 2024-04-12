package com.esercitazione17.demo.service;

import com.esercitazione17.demo.dto.UtenteDto;
import com.esercitazione17.demo.entity.Utente;
import com.esercitazione17.demo.repository.UtentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteServiceImpl implements UtenteService{
    @Autowired
    private UtentiRepository utentiRepository;

    @Override
    public String aggiungiUtente(UtenteDto utenteDto){
        Utente utente = new Utente(
                utenteDto.getId(),
                utenteDto.getNome(),
                utenteDto.getCognome(),
                utenteDto.getEmail(),
                utenteDto.getPassword()
        );

        utentiRepository.save(utente);
        return "Utente Registrato";

    }
}
