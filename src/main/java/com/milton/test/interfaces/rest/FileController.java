package com.milton.test.interfaces.rest;

import com.milton.test.application.ports.input.FileRetrievalUseCase;
import com.milton.test.domain.model.FileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileRetrievalUseCase fileRetrievalUseCase;

    @Autowired
    public FileController(FileRetrievalUseCase fileRetrievalUseCase) {
        this.fileRetrievalUseCase = fileRetrievalUseCase;
    }

    @GetMapping("/list")
    public ResponseEntity<List<?>> listFiles() {
        try {
            List<FileDto> files = fileRetrievalUseCase.retrieveFiles();
            return ResponseEntity.ok(files);
        } catch (RuntimeException e) {
            List<ErrorResponse> errorResponse = List.of(
                    new ErrorResponse(
                            "Error",
                            "El directorio no existe por favor cargar un archivo.",
                            System.currentTimeMillis()
                    )
            );
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(errorResponse);
        }
    }
}