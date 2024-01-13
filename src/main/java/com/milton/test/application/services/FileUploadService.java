package com.milton.test.application.services;

import com.milton.test.application.ports.input.FileUploadUseCase;
import com.milton.test.infrastructure.adapters.input.FileStorageAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService implements FileUploadUseCase {

    private final FileStorageAdapter fileStorageAdapter;

    @Autowired
    public FileUploadService(FileStorageAdapter fileStorageAdapter) {
        this.fileStorageAdapter = fileStorageAdapter;
    }

    @Override
    public void uploadFile(MultipartFile file) {
        fileStorageAdapter.saveFile(file);
    }
}