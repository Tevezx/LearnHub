package com.learnhub.domain.usuario;

import com.learnhub.domain.conteudo.Modulo;
import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Instrutor extends Usuario{
    private List<Curso> cursos = new ArrayList<>();


    public Instrutor(String id, String nome, String email, Date dataCadastro, Status status) {
        super(id, nome, email, dataCadastro, status);
    }

    public Curso criarCurso(String id, String titulo, String descricao, List<Instrutor> instrutor, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso, List<Modulo> modulos, List<Aluno> alunosMatriculados){
        Curso curso = criarCurso(id, titulo, descricao, instrutor, nivelCurso, cargaHoraria, dataCriacao, statusCurso, modulos, alunosMatriculados);
        cursos.add(curso);
        return curso;
    }

    public List<Curso> getCursos(){
        return cursos;
    }


}
