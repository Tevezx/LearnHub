package com.learnhub.service;

import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.domain.usuario.Instrutor;
import com.learnhub.execption.BusinessExecption;

import java.time.LocalDate;

public class CursoService {
    public Curso criarCurso(String id, String titulo, String descricao, NivelCurso nivelCurso, Instrutor instrutor, String cargaHoraria, LocalDate dataCriacao, StatusCurso statusCurso){
        if(statusCurso.equals(StatusCurso.ARQUIVADO) || statusCurso.equals(StatusCurso.RASCUNHO)){
            throw new BusinessExecption("Curso deve estar publicado para adicionar módulo!");
        }

        System.out.println("Curso: " + titulo + ", criado com sucesso!");
        return new Curso(id, titulo, descricao, nivelCurso, instrutor, cargaHoraria, dataCriacao, statusCurso);
    }
}
