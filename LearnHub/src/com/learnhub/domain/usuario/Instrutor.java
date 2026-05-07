package com.learnhub.domain.usuario;

import com.learnhub.domain.curso.Curso;
import com.learnhub.domain.curso.NivelCurso;
import com.learnhub.domain.curso.StatusCurso;
import com.learnhub.service.CursoService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Instrutor extends Usuario{
    private List<Curso> cursos = new ArrayList<>();

    public Instrutor(String id, String nome, String email, Date dataCadastro, Status status) {
        super(id, nome, email, dataCadastro, status);
    }

    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        System.out.println("Curso: " + curso.getTitulo() + " adicionado ao instrutor!");
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", status=" + getStatus() +
                '}';
    }

    public List<Curso> getCursos(){
        return cursos;
    }
}
