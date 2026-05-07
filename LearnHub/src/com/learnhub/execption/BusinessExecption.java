package com.learnhub.execption;

public class BusinessExecption extends RuntimeException {
    public BusinessExecption(String message) {
        super(message);
    }
}
