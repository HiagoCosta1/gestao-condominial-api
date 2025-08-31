package com.projeto.condominio.repository;

import com.projeto.condominio.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
}
