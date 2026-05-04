package com.learnhub.domain.usuario;

import com.learnhub.domain.curso.Curso;
import com.learnhub.service.AlunoService;

import java.util.Date;

public class Aluno extends Usuario{
    private Curso curso;

    public Aluno(String id, String nome, String email, Date dataCadastro, Status status) {
        super(id, nome, email, dataCadastro, status);
    }

     @Override
    public String toString() {
         return "Aluno{" +
                 "id='" + getId() + '\'' +
                 ", nome='" + getNome() + '\'' +
                 ", email='" + getEmail() + '\'' +
                 ", dataCadastro=" + getDataCadastro() +
                 ", status=" + getStatus() +
                 '}';
     }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
