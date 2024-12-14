package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String telefone;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}
