package com.learnhub.domain.curso;

import com.learnhub.domain.conteudo.Modulo;
import com.learnhub.domain.usuario.Aluno;
import com.learnhub.domain.usuario.Instrutor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curso {
    private String id;
    private String titulo;
    private String descricao;
    private Instrutor instrutor;
    private NivelCurso nivelCurso;
    private String cargaHoraria;
    private final Date dataCriacao;
    private StatusCurso statusCurso;
    private List<Modulo> modulos = new ArrayList<>();
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Curso(String id, String titulo, String descricao, Instrutor instrutor, NivelCurso nivelCurso, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.instrutor = instrutor;
        this.nivelCurso = nivelCurso;
        this.cargaHoraria = cargaHoraria;
        this.dataCriacao = dataCriacao;
        this.statusCurso = statusCurso;
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

    public Curso(String id, String titulo, String descricao, NivelCurso nivelCurso, Instrutor instrutor, String cargaHoraria, Date dataCriacao, StatusCurso statusCurso) {
        this(id, titulo, descricao, nivelCurso, cargaHoraria, dataCriacao, statusCurso);
        this.instrutor = instrutor;
    }

    public void adicionarModulo(Modulo modulo){
        modulos.add(modulo);
        System.out.println("Módulo: " + modulo.getTitulo() + " adicionado com sucesso!");
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

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
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
