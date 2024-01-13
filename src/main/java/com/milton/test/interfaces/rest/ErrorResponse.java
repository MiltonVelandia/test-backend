package com.milton.test.interfaces.rest;

public class ErrorResponse {
    private String error;
    private String name;
    private long timestamp;

    public ErrorResponse(String error, String name, long timestamp) {
        this.error = error;
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public String getName() {
        return name;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
