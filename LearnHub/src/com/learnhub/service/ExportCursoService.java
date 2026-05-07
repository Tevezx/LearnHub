package com.learnhub.service;

import com.learnhub.domain.curso.Curso;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExportCursoService {
    public void exportCurso(Curso curso) throws IOException {
        Path path = Paths.get("Curso/curso.json");

        Files.createDirectories(path.getParent());

        String conteudo = curso.toString();

        Files.writeString(path, conteudo);
    }
}
