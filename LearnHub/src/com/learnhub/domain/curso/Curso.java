package com.learnhub.domain.curso;

import com.learnhub.domain.conteudo.Modulo;
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
    private List<Aluno> alunosMatriculados;

    public Curso(String id, String titulo, String descricao, List<Instrutor> instrutor, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso, List<Modulo> modulos, List<Aluno> alunosMatriculados) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.nivelCurso = nivelCurso;
        this.cargaHoraria = cargaHoraria;
        this.dataCriacao = dataCriacao;
        this.statusCurso = statusCurso;
        this.modulos = modulos;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Curso(String id, String titulo, String descricao, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivelCurso = nivelCurso;
        this.cargaHoraria = cargaHoraria;
        this.dataCriacao = dataCriacao;
        this.statusCurso = statusCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", instrutor=" + instrutor +
                ", nivelCurso=" + nivelCurso +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", statusCurso=" + statusCurso +
                ", modulos=" + modulos +
                ", alunosMatriculados=" + alunosMatriculados +
                '}';
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public StatusCurso getStatusCurso() {
        return statusCurso;
    }

    public void setStatusCurso(StatusCurso statusCurso) {
        this.statusCurso = statusCurso;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public NivelCurso getNivelCurso() {
        return nivelCurso;
    }

    public void setNivelCurso(NivelCurso nivelCurso) {
        this.nivelCurso = nivelCurso;
    }

    public List<Instrutor> getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(List<Instrutor> instrutor) {
        this.instrutor = instrutor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
