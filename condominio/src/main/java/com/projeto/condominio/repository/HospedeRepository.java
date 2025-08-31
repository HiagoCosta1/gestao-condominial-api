package com.projeto.condominio.repository;

import com.projeto.condominio.model.Hospede;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospedeRepository extends JpaRepository<Hospede, Long> {
}
