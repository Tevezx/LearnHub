package com.learnhub.service;

import com.learnhub.domain.conteudo.Modulo;
import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.domain.usuario.Aluno;
import com.learnhub.domain.usuario.Instrutor;

import java.util.Date;
import java.util.List;

public class CursoService {
    public Curso criarCurso(String id, String titulo, String descricao, List<Instrutor> instrutor, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso, List<Modulo> modulos, List<Aluno> alunosMatriculados){
        return new Curso(id, titulo, descricao, instrutor, nivelCurso, cargaHoraria, dataCriacao, statusCurso, modulos, alunosMatriculados);
    }
}
