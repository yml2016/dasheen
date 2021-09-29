package com.dasheen.common.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
//@WebFilter(urlPatterns = {"/servlet"})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        log.info("原生组件MyFilter#init()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("原生组件MyFilter#doFilter()");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("原生组件MyFilter#destroy()");
    }
}
