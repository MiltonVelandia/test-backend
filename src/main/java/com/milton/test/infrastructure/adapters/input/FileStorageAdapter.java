package com.milton.test.infrastructure.adapters.input;

import com.milton.test.domain.model.FileDto;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FileStorageAdapter {
    private static final String UPLOAD_DIR = "C:/Users/user/Documents/CPFFiles";
    private static final String LIST_DIRECTORY_PATH = "C:/Users/user/Documents/CPFFiles";

    public void saveFile(MultipartFile file) {
        try {
            File directory = new File(UPLOAD_DIR);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            Files.copy(file.getInputStream(), Paths.get(directory.getAbsolutePath(), file.getOriginalFilename()));
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar el archivo", e);
        }
    }
    public List<FileDto> listFiles() {
        File folder = new File(LIST_DIRECTORY_PATH);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new RuntimeException("El directorio no existe por favor cargar un archivo.");
        }

        return Arrays.stream(folder.listFiles())
                .map(file -> new FileDto(file.getName(), file.length()))
                .collect(Collectors.toList());
    }
}