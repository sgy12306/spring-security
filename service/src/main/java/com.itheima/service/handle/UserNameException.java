package com.itheima.service.handle;

import org.springframework.security.core.AuthenticationException;

public class UserNameException extends AuthenticationException {
    public UserNameException(String msg) {
        super(msg);
    }
}
