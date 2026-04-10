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
    public Curso criarCurso(String id, String titulo, String descricao, NivelCurso nivelCurso, Instrutor instrutor, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso){
        if(statusCurso.equals(StatusCurso.ARQUIVADO) || statusCurso.equals(StatusCurso.RASCUNHO)){
            throw new IllegalArgumentException("Curso deve estar publicado para adicionar módulo!");
        }

        return new Curso(id, titulo, descricao, nivelCurso, instrutor, cargaHoraria, dataCriacao, statusCurso);
    }
}
