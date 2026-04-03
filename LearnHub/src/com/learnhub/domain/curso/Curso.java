package com.learnhub.domain.curso;

import com.learnhub.domain.usuario.Aluno;
import com.learnhub.domain.usuario.Instrutor;

import java.util.Date;
import java.util.List;

public class Curso {
    private String id;
    private String titulo;
    private String descricao;
    private List<Instrutor> instrutor;
    private NivelCurso nivelCurso;
    private String cargaHoraria;
    private Date dataCriacao;
    private StatusCurso statusCurso;
    private List<Modulo> modulos;
    private List<Avaliacao> avaliacoes;
    private List<Aluno> alunosMatriculados;
}
