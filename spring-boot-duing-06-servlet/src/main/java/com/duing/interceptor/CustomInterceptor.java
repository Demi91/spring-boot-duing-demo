package com.duing.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class CustomInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                      HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("...........CustomInterceptor prehandle...........");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                    HttpServletResponse response, Object handler,
                    @Nullable ModelAndView modelAndView) throws Exception {

        System.out.println("...........CustomInterceptor postHandle...........");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler,
                                 @Nullable Exception ex) throws Exception {

        System.out.println("...........CustomInterceptor afterCompletion...........");

    }

}
