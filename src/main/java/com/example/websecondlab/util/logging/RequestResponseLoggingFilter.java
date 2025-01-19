package com.example.websecondlab.util.logging;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class RequestResponseLoggingFilter extends OncePerRequestFilter {

    private static final Logger LOG = LogManager.getLogger(RequestResponseLoggingFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Логирование запроса
        LOG.info("Request: method={}, URI={}, params={}",
                request.getMethod(),
                request.getRequestURI(),
                request.getParameterMap());

        // Продолжение обработки запроса
        filterChain.doFilter(request, response);

        // Логирование ответа
        LOG.info("Response: status={}, contentType={}",
                response.getStatus(),
                response.getContentType());
    }

}