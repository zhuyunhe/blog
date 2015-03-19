package com.zyh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	
	        //request.setCharacterEncoding("GBK");
		 	String username = request.getParameter("username");
		 	String password = request.getParameter("password");
		
		 	if(username !=null && password != null){
    		 	if(username.equals("zhuyunhe") && password.equals("123456")){
    		 		
    		 	    HttpSession session = request.getSession();
    		 	    session.setAttribute("username", username);
    		 		//重定向到主页
    		 		response.sendRedirect("modules/homepage/homepage.html");
    		 		//request.getRequestDispatcher("modules/homepage/homepage.jsp").forward(request, response);
    		 	
    		 	} else{
    		 		//重定向到登陆页
    		 		response.sendRedirect("modules/login/loginPage.html");
    		 	}
		 	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
