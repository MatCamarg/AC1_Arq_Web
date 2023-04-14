package com.example.ac1;

import java.util.List;

import com.example.ac1.model.Curso;
import com.example.ac1.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired
    CursoRepository CursoRepository;

    @GetMapping(value = "/ObterCursos")
	public List<Curso> findAll() {
		return CursoRepository.findAll();
	}

    @PostMapping(value = "/Inserir")
	public Curso InserirCurso(@RequestBody Curso NewCurso) {
		return CursoRepository.save(NewCurso);
	}

	@PutMapping(value = "/Editar")
	public Curso EditarCurso(@RequestBody Curso Curso) {
		return CursoRepository.save(Curso);
	}

	@DeleteMapping(value = "Deletar/{id}")
	public void Remover(@PathVariable("id") int id) {
		CursoRepository.deleteById((long) id);
	}

}
