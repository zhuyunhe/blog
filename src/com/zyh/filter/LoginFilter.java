package com.zyh.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(urlPatterns="/zzzz",initParams={@WebInitParam(name="name",value="zhu")})
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	    System.out.println("过滤器销毁");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
	    HttpServletRequest req = (HttpServletRequest)request;
	    HttpSession session = req.getSession();
	    System.out.println("过滤器");
	    if(session.getAttribute("username")!=null){
	        // pass the  request along the filter chain
	        chain.doFilter(request, response);
	    } else{
	        //HttpServletResponse res = (HttpServletResponse)response;
	        //res.sendRedirect("modules/login/loginPage.html");
	    }
	        
	    
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	    String initParam = fConfig.getInitParameter("name");
	    System.out.println("过滤器初始化参数为："+initParam);
	}

}
