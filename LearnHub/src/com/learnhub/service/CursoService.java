package com.learnhub.service;

import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.domain.usuario.Instrutor;
import com.learnhub.exeption.BusinessExeption;

import java.time.LocalDate;
import java.util.Date;

public class CursoService {
    public Curso criarCurso(String id, String titulo, String descricao, NivelCurso nivelCurso, Instrutor instrutor, String cargaHoraria, LocalDate dataCriacao, StatusCurso statusCurso){
        if(statusCurso.equals(StatusCurso.ARQUIVADO) || statusCurso.equals(StatusCurso.RASCUNHO)){
            throw new BusinessExeption("Curso deve estar publicado para adicionar módulo!");
        }

        return new Curso(id, titulo, descricao, nivelCurso, instrutor, cargaHoraria, dataCriacao, statusCurso);
    }
}
