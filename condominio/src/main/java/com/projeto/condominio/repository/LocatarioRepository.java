package com.projeto.condominio.repository;

import com.projeto.condominio.model.Locatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocatarioRepository extends JpaRepository<Locatario, Long> {
}
