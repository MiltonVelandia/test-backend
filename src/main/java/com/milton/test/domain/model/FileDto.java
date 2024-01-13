package com.milton.test.domain.model;

public class FileDto {
    private String name;
    private long size; // Tamaño en bytes

    // Constructor, getters y setters
    public FileDto(String name, long size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
