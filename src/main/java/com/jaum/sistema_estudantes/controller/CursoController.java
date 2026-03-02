package com.jaum.sistema_estudantes.controller;

import com.jaum.sistema_estudantes.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final List<Curso> cursos = List.of(
            new Curso(1, "Engenharia de Software"),
            new Curso(2, "Ciência da Computação"),
            new Curso(3, "Sistemas de Informação"),
            new Curso(4, "Análise e Desenvolvimento de Sistemas"),
            new Curso(5, "Engenharia da Computação")
    );

    @GetMapping
    public List<Curso> listarCursos() {
        return cursos;
    }

    @GetMapping("/{id}")
    public String buscarCursoPorId(@PathVariable int id) {
        return cursos.stream()
                .filter(curso -> curso.getId() == id)
                .map(Curso::getNome)
                .findFirst()
                .orElse("Curso não encontrado");
    }
}
