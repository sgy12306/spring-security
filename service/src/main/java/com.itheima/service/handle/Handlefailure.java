package com.itheima.service.handle;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component("failure")
public class Handlefailure extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        if (exception instanceof DisabledException) {
        //账号过期
            request.setAttribute("errorMsg","你的账号过期了");
            request.getRequestDispatcher("/statusError.jsp").forward(request,response);
        }
        if (exception instanceof BadCredentialsException) {
            request.setAttribute("errorMsg","账号密码错误");
            request.getRequestDispatcher("/numberError.jsp").forward(request,response);
        }
        if(exception instanceof InternalAuthenticationServiceException){
            request.setAttribute("errorMsg","账号错误");
            request.getRequestDispatcher("/numberError.jsp").forward(request,response);
        }


    }
}
