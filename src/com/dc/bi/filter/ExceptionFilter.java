package com.dc.bi.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ExceptionFilter
 */
@WebFilter(description = "filter all error", urlPatterns = { "/*" })
public class ExceptionFilter implements Filter {

    public ExceptionFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try{
			chain.doFilter(request, response);
		}catch(Exception e){
			System.out.println("error");
			request.getRequestDispatcher("Exception/ExceptionDetail.jsp").forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
