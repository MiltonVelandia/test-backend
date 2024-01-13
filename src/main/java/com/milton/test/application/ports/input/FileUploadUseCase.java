package com.milton.test.application.ports.input;

import org.springframework.web.multipart.MultipartFile;
public interface FileUploadUseCase {
    void uploadFile(MultipartFile file);
}
