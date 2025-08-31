package com.projeto.condominio.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "contratolocacao")
@Data
public class ContratoLocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrato;

    @Column(nullable = false)
    private LocalDate dataEntrada;

    @Column(nullable = false)
    private LocalDate dataSaida;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorAluguel;

    @Column(nullable = false, length = 20)
    private String status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_apartamento", nullable = false)
    private Apartamento apartamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_locatario", nullable = false)
    private Locatario locatario;



}
