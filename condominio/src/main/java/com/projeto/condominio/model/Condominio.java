package com.projeto.condominio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name = "condominio")
@Data
public class Condominio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_condominio")
    private Long idCondominio;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 255)
    private String endereco;


    @Column(nullable = false, unique = true, length = 18)
    private String cnpj;


    @OneToMany(mappedBy = "condominio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Apartamento> apartamentos;

}
