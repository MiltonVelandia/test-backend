package com.milton.test.interfaces.rest;

import com.milton.test.application.ports.input.FileUploadUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/files")
public class FileUploadController {

    private final FileUploadUseCase fileUploadUseCase;

    @Autowired
    public FileUploadController(FileUploadUseCase fileUploadUseCase) {
        this.fileUploadUseCase = fileUploadUseCase;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        fileUploadUseCase.uploadFile(file);
        return new ResponseEntity<>("Archivo cargado con éxito!", HttpStatus.OK);
    }
}