package com.learnhub.domain.conteudo;

import com.learnhub.domain.usuario.Instrutor;

public class Aula {
    private String id;
    private String titulo;
    private Integer duracao;
    private TipoAula tipoAula;
    private Integer ordem;
    private Instrutor instrutor;

    public Aula(String id, String titulo, Integer duracao, TipoAula tipoAula, Integer ordem, Instrutor instrutor) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.tipoAula = tipoAula;
        this.ordem = ordem;
        this.instrutor = instrutor;
    }

    public void adicionarInstrutor(Instrutor instrutor){
        this.instrutor = instrutor;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", tipoAula=" + tipoAula +
                ", ordem=" + ordem +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public TipoAula getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(TipoAula tipoAula) {
        this.tipoAula = tipoAula;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }
}
