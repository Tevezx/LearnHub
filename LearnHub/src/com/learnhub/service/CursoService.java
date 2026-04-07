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
    public Curso criarCurso(String id, String titulo, String descricao, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso){
        return new Curso(id, titulo, descricao, nivelCurso, cargaHoraria, dataCriacao, statusCurso);
    }
}
