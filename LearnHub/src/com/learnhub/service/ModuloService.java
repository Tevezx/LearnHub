package com.learnhub.service;

import com.learnhub.domain.conteudo.Aula;
import com.learnhub.domain.conteudo.Modulo;
import com.learnhub.exeption.BusinessExeption;

public class ModuloService {
    // Service é apenas para validar a regra de negocio, enquanto o domain serve para fazer o metodo de determinada classe

    public void adicionarAulas(Modulo modulo, Aula aula){
        if(modulo.getAulas().size() >= 10){
            throw new BusinessExeption("Limite de aulas atingido");
        }

        modulo.adicionarAulas(aula);
    }
}
