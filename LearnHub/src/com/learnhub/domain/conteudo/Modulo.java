package com.learnhub.domain.conteudo;

import java.util.List;

public class Modulo {
    private String id;
    private String titulo;
    private String descricao;
    private Integer ordem;
    private List<Aula> aulas;

    public Modulo(String id, String titulo, String descricao, Integer ordem, List<Aula> aulas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.ordem = ordem;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ordem=" + ordem +
                ", aulas=" + aulas +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O titulo do módulo não pode estar vázio!");
        }

        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        if (ordem == null || ordem <= 0) {
            throw new IllegalArgumentException("A ordem do módulo deve ser maior ou igual a 1");
        }

        this.ordem = ordem;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        if (aulas == null || aulas.isEmpty()) {
            throw new IllegalArgumentException("As aulas não podem estarem vazias!");
        }

        this.aulas = aulas;
    }
}
