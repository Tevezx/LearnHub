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
import com.learnhub.service.*;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bem-vindo ao LearnHub!");

        CursoService cursoService = new CursoService();
        AlunoService alunoService = new AlunoService();
        ModuloService moduloService = new ModuloService();
        ExportCursoService exportCursoService = new ExportCursoService();

        // Instrutor criando um curso
        Instrutor instrutor = new Instrutor("1", "João Silva", "joao@gmail.com", new java.util.Date(), Status.ATIVO);
        LogService.salvar("Instrutor criado com sucesso!");

        Curso curso = cursoService.criarCurso("1", "Java para Iniciantes",
                "Curso introdutório de Java",
                NivelCurso.INICIANTE, instrutor, "40 horas", LocalDate.now(),
                StatusCurso.PUBLICADO);
        LogService.salvar("Curso: " + curso.getTitulo() + ", criado com sucesso!");

        instrutor.adicionarCurso(curso);
        LogService.salvar("Instrutor: " + instrutor.getNome() + ", adicionado ao curso!");


        // Criação de Aluno e Matricula no curso criado
        Aluno aluno = new Aluno("1", "Carlos", "carlos@gmail.com", new java.util.Date(), Status.ATIVO);
        LogService.salvar("Aluno: " + aluno.getNome() + ", criado com sucesso!");

        alunoService.matricularAluno(aluno, instrutor.getCursos().getFirst());
        LogService.salvar("Aluno: " + aluno.getNome() + ", matriculado ao curso: " + curso.getTitulo());

        // Criando Aula
        Aula aula = new Aula("1", "Aprendendo Java Básico", 20, TipoAula.VIDEO, 1, instrutor);
        LogService.salvar("Aula: " + aula.getTitulo() + ", criada com sucesso!");

        // Criando modulo e Adicionando aula
        Modulo modulo = new Modulo("1", "Modulo - Java", "Aulas de Java", 1);
        LogService.salvar("Módulo: " + modulo.getTitulo() + ", criado com sucesso!");

        moduloService.adicionarAulas(modulo, aula);
        LogService.salvar("Aula: " + aula.getTitulo() + ", adicionada ao módulo: " + modulo.getTitulo());

        // Adicionando modulo no curso
        curso.adicionarModulo(modulo);
        LogService.salvar("Módulo: " + modulo.getTitulo() + ", adicionado ao curso: " + curso.getTitulo());

        // Exportando curso criado para arquivo .json
        exportCursoService.exportCurso(curso);
        LogService.salvar("Export de Curso em .json realizado com sucesso!");

    }
}