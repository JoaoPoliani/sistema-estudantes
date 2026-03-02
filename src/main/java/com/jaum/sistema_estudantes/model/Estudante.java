package com.jaum.sistema_estudantes.model;

public class Estudante {
    private String matricula;
    private String nome;
    private String curso;
    private int semestre;
    private String status;

    public Estudante(String matricula, String nome, String curso, int semestre, String status) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.status = status;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getStatus() {
        return status;
    }
}
