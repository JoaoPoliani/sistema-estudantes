package com.jaum.sistema_estudantes.controller;

import com.jaum.sistema_estudantes.model.Estudante;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {

    private final List<Estudante> estudantes = List.of(
            new Estudante("2024001", "João Silva", "Engenharia de Software", 3, "Ativo"),
            new Estudante("2024002", "Maria Souza", "Ciência da Computação", 5, "Ativo"),
            new Estudante("2024003", "Carlos Lima", "Sistemas de Informação", 2, "Trancado")
    );

    @GetMapping("/{matricula}")
    public String buscarEstudante(@PathVariable String matricula) {
        return estudantes.stream()
                .filter(e -> e.getMatricula().equals(matricula))
                .map(e ->
                        "Matrícula: " + e.getMatricula() +
                                "\nNome: " + e.getNome() +
                                "\nCurso: " + e.getCurso() +
                                "\nSemestre: " + e.getSemestre() +
                                "\nStatus: " + e.getStatus()
                )
                .findFirst()
                .orElse("Estudante não encontrado");
    }
    @GetMapping("/curso/{curso}")
    public List<Estudante> buscarPorCurso(@PathVariable String curso) {
        return estudantes.stream()
                .filter(e -> e.getCurso().equalsIgnoreCase(curso))
                .toList();
    }
}