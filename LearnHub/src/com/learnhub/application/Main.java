package com.learnhub.application;

import com.learnhub.domain.conteudo.Aula;
import com.learnhub.domain.conteudo.Modulo;
import com.learnhub.domain.conteudo.TipoAula;
import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.domain.usuario.Aluno;
import com.learnhub.domain.usuario.Instrutor;
import com.learnhub.domain.usuario.Status;
import com.learnhub.service.AlunoService;
import com.learnhub.service.CursoService;
import com.learnhub.service.ModuloService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao LearnHub!");

        CursoService cursoService = new CursoService();
        AlunoService alunoService = new AlunoService();
        ModuloService moduloService = new ModuloService();

        // Instrutor criando um curso
        Instrutor instrutor = new Instrutor("1", "João Silva", "joao@gmail.com", new java.util.Date(), Status.ATIVO);
        Curso curso = cursoService.criarCurso("1", "Java para Iniciantes", "Curso introdutório de Java", NivelCurso.INICIANTE,  instrutor, "40 horas", LocalDate.now(), StatusCurso.PUBLICADO);
        instrutor.adicionarCurso(curso);

        System.out.println(instrutor.getCursos());

        // Criação de Aluno e Matricula no curso criado
        Aluno aluno = new Aluno("1", "Carlos", "carlos@gmail.com", new java.util.Date(), Status.ATIVO);
        alunoService.matricularAluno(aluno, instrutor.getCursos().getFirst());

        // Criando Aula
        Aula aula = new Aula("1", "Aprendendo Java Básico", 20, TipoAula.VIDEO, 1, instrutor);

        // Criando modulo e Adicionando aula
        Modulo modulo = new Modulo("1", "Modulo - Java", "Aulas de Java", 1);
        moduloService.adicionarAulas(modulo, aula);

        // Adicionando modulo no curso
        curso.adicionarModulo(modulo);

        System.out.println(curso);

    }
}