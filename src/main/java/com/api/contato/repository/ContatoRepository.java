package com.api.contato.repository;

import com.api.contato.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContatoRepository extends JpaRepository<Contato,Long> {
}
