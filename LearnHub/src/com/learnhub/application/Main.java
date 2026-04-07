package com.learnhub.application;

import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.domain.usuario.Instrutor;
import com.learnhub.domain.usuario.Status;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao LearnHub!");

        // Instrutor criando um curso
        Instrutor instrutor = new Instrutor("1", "João Silva", "joao@gmail.com", new java.util.Date(), Status.ATIVO);
        instrutor.criarCurso("1", "Java para Iniciantes", "Curso introdutório de Java", NivelCurso.INICIANTE, "40 horas", new java.util.Date(), StatusCurso.PUBLICADO);

        System.out.println(instrutor.getCursos());
    }
}