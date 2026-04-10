package com.learnhub.service;

import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.domain.usuario.Aluno;
import com.learnhub.domain.usuario.Status;

public class AlunoService {

    public void matricularAluno(Aluno aluno, Curso curso) {
        if (!(curso.getStatusCurso() == StatusCurso.PUBLICADO)) {
            throw new IllegalArgumentException("Não foi possível matricular o aluno" + aluno.getNome() + " pois curso não está publicado");
        }
        if(!(aluno.getStatus() == Status.ATIVO)){
            throw new IllegalArgumentException("Aluno não está ativo");
        }

        curso.getAlunosMatriculados().add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso " + curso.getTitulo());
    }
}
