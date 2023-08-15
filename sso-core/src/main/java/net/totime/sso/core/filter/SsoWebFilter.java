package net.totime.sso.core.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/08/15
 * @description 单点登录Web过滤器，继承自HttpServlet，实现Filter接口
 * @since 1.0.0
 */
public class SsoWebFilter extends HttpServlet implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
