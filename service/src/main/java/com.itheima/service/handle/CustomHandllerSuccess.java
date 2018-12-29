package com.itheima.service.handle;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import untils.DateToStr;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
@Component("successHandle")
public class CustomHandllerSuccess extends SavedRequestAwareAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        request.getSession().setAttribute("loginTime", DateToStr.DateToString(new Date()));
        //super.onAuthenticationSuccess(request, response, authentication);
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
