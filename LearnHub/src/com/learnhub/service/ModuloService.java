package com.learnhub.service;

import com.learnhub.domain.conteudo.Aula;
import com.learnhub.domain.conteudo.Modulo;
import com.learnhub.execption.BusinessExecption;

public class ModuloService {
    // Service é apenas para validar a regra de negocio, enquanto o domain serve para fazer o metodo de determinada classe

    public void adicionarAulas(Modulo modulo, Aula aula){
        if(modulo.getAulas().size() >= 10){
            throw new BusinessExecption("Limite de aulas atingido");
        }

        modulo.adicionarAulas(aula);
        System.out.println("Módulo: " + modulo.getTitulo() + ", adicionado com sucesso!");
    }
}
