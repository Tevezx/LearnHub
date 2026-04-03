package com.learnhub.domain;

import java.util.Date;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private Date dataCadastro;
    // private Status status;


    public Usuario(String id, String nome, String email, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }


}
