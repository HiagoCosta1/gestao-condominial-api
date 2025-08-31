package com.projeto.condominio.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "hospede")
@Data

public class Hospede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hospede")
    private Long idHospede;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 20)
    private String documento;

    @Column(nullable = false)
    private LocalDate dataEntrada;

    @Column(nullable = false)
    private LocalDate dataSaida;

    private boolean autorizado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_apartamento", nullable = false)
    private Apartamento apartamento;
}
