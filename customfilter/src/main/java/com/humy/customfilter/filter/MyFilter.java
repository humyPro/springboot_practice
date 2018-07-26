package com.humy.customfilter.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println(" MyFilter init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String msg = "This is MyFilter,utl:" + request.getRequestURI();
        System.out.println(msg);
        request.setAttribute("msg", msg);
        filterChain.doFilter(request, servletResponse);

    }

    @Override
    public void destroy() {

    }
}
