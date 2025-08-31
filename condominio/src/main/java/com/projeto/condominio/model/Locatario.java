package com.projeto.condominio.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "locatario")
@Data
public class Locatario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locatario")
    private Long idLocatario;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(length = 20)
    private String telefone;

    @Column(length = 100)
    private String email;
}
