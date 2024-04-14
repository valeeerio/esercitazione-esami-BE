package com.esercitazione17.demo.repository;

import com.esercitazione17.demo.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtentiRepository extends JpaRepository<Utente, Integer > {
    boolean esistePerEmail(String email);
    boolean esistePerNome(String nome);
    Utente trovaPerEmail(String email);
}
