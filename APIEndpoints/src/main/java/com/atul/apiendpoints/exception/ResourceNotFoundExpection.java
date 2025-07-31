package com.atul.apiendpoints.exception;

public class ResourceNotFoundExpection extends RuntimeException {
    public ResourceNotFoundExpection(String message) {
        super(message);
    }
}
