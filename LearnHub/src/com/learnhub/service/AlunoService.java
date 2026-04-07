package com.learnhub.service;

import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.usuario.Aluno;
import com.learnhub.domain.usuario.Status;

public class AlunoService {
    public Aluno criarAluno(String id, String nome, String email, java.util.Date dataCadastro, Status status){
        return new Aluno(id, nome, email, dataCadastro, status);
    }

    public Curso matricularAluno(String id, Curso curso){
        return curso;
    }
}
