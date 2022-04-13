package com.example.jcasbin;

/**
 * @author : yx-0176
 * @description
 * @date : 2021/1/25
 */
public class AuthException extends Exception {

    public AuthException() {
    }

    public AuthException(String message) {
        super(message);
    }

    public AuthException(Throwable cause) {
        super(cause);
    }
}
