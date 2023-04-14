package com.example.ac1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date DataInicio;
    private Date DataFim;
    private String HoraInicio;
    private String HoraFim;
    private String Cidade;
    private String UF;
    private String CEP;

    @ManyToOne
    @JoinColumn(name="professor_id")
    private Professor Professor;

    @ManyToOne
    @JoinColumn(name="curso_id")
    private Curso Curso;

}
