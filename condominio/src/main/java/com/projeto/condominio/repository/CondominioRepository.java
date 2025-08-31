package com.projeto.condominio.repository;

import com.projeto.condominio.model.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondominioRepository extends JpaRepository<Condominio, Long> {
}
