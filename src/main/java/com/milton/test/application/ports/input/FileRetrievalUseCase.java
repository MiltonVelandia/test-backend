package com.milton.test.application.ports.input;

import com.milton.test.domain.model.FileDto;
import java.util.List;

public interface FileRetrievalUseCase {
    List<FileDto> retrieveFiles();
}
