package com.projeto.condominio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "apartamento")
@Data
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_apartamento")
    private Long idApartamento;

    @Column(nullable = false)
    private int numero;

    private int andar;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_condominio", nullable = false)
    private Condominio condominio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Proprietario proprietario;






}
