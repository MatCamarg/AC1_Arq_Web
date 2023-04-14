package com.example.ac1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Especializacao {
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso Curso;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor Professor;
}
