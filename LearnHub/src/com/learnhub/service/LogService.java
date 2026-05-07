package com.learnhub.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class LogService {
    private static final Path caminhoLogs = Paths.get("Logs/logs.txt");

    public static void salvar(String mensagem) throws IOException {

        Files.createDirectories(caminhoLogs.getParent());

        String log = LocalDateTime.now() + "-" + mensagem + "\n";

        Files.writeString(caminhoLogs, log, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
