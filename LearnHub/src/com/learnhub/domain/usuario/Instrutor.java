package com.learnhub.domain.usuario;

import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.service.CursoService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Instrutor extends Usuario{
    private List<Curso> cursos = new ArrayList<>();
    private CursoService cursoService = new CursoService();


    public Instrutor(String id, String nome, String email, Date dataCadastro, Status status) {
        super(id, nome, email, dataCadastro, status);
    }

    public Curso criarCurso(String id, String titulo, String descricao, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso){
        Curso curso = cursoService.criarCurso(id, titulo, descricao, nivelCurso, cargaHoraria, dataCriacao, statusCurso);
        cursos.add(curso);
        return curso;
    }

    public List<Curso> getCursos(){
        return cursos;
    }


}
