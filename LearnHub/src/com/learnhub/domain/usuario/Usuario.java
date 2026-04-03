package com.learnhub.domain.usuario;

import java.util.Date;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private Date dataCadastro;
    private Status status;

    public Usuario(String id, String nome, String email, Date dataCadastro, Status status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Status getStatus() {
        return status;
    }
}
