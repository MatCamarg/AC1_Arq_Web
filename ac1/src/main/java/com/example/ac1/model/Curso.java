package com.example.ac1.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String Descricao;

    private Integer CargaHoraria;

    @Column(length = 200, nullable = false)
    private String Objetivo;
    
    @Column(length = 200, nullable = false)
    private String Ementa;

    @OneToMany(mappedBy = "Especializacao")
    private List<Especializacao> Especializacoes;

    @OneToMany(mappedBy = "Agendamento")
    private List<Agendamento> Agendamentos;
}
