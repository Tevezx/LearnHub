package com.learnhub.domain.usuario;

import com.learnhub.domain.curso.Curso;
import com.learnhub.service.AlunoService;

import java.util.Date;
import java.util.List;

public class Aluno extends Usuario{
    private AlunoService alunoService;
    private Curso curso;

    public Aluno(String id, String nome, String email, Date dataCadastro, Status status) {
        super(id, nome, email, dataCadastro, status);
    }

    public Aluno criarAluno(String id, String nome, String email, Date dataCadastro, Status status){
        return alunoService.criarAluno(id, nome, email, dataCadastro, status);
    }

    public Curso matricularAluno(String id, Curso curso){
        return alunoService.matricularAluno(id, curso);
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


}
