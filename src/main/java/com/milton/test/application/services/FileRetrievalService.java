package com.milton.test.application.services;

import com.milton.test.application.ports.input.FileRetrievalUseCase;
import com.milton.test.domain.model.FileDto;
import com.milton.test.infrastructure.adapters.input.FileStorageAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileRetrievalService implements FileRetrievalUseCase {

    private final FileStorageAdapter fileStorageAdapter;

    @Autowired
    public FileRetrievalService(FileStorageAdapter fileStorageAdapter) {
        this.fileStorageAdapter = fileStorageAdapter;
    }

    @Override
    public List<FileDto> retrieveFiles() {
        return fileStorageAdapter.listFiles();
    }
}