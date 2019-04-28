package com.capstone.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capstone.dao.Userdao;
import com.capstone.pojo.User;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		String username=request.getParameter("username");  
		String password=request.getParameter("password");
		
		User customer = Userdao.loginUser(username, password);
		
		if(customer.getUsername()!=null && customer.getPassword()!=null) 
		{
			HttpSession session=request.getSession(true);
			 session.setAttribute("customer", customer);		
			 //response.sendRedirect("home.jsp");
			    out.println("<script type=\"text/javascript\">");
				out.println("alert('you are successfully logged in, Thank You');");
				out.println("location='index.jsp';");
				out.println("</script>");
		}
		else 
		{
			 out.println("<script type=\"text/javascript\">");
				out.println("alert('username or password incorrect, please try different');");
				out.println("location='login.jsp';");
				out.println("</script>");
		}
		out.close();
		    
// TODO Auto-generated method stub
	}

}
