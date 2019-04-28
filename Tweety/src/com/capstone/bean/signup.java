package com.capstone.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capstone.dao.Userdao;
import com.capstone.pojo.User;


/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        String un=request.getParameter("username");  
        String e=request.getParameter("email");
        String ph=request.getParameter("phone");
        String pd=request.getParameter("password");
        String r=request.getParameter("repass");
        
        if(pd.equals(r)) {
       	 User u1= new User();
           u1.setUsername(un);
           u1.setEmail(e);
           u1.setPassword(pd);
             
            try {
           	 
                long mb_no = Long.parseLong(ph);
                u1.setPhone(mb_no);
           	          	   
              }
              catch(NumberFormatException n) {
           	  System.out.println("error in input of mobile number");
           	  n.printStackTrace();
              }
             
            Userdao ud = new Userdao();
            int status = ud.saveUser(u1);
            
            if(status>0) {
           	pw.println("<script type=\"text/javascript\">");
				pw.println("alert('you are successfully registered, Thank You');");
				pw.println("location='login.jsp';");
				pw.println("</script>");
            }else{
   			 pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Registration error, please try once more');");
				pw.println("location='signup.jsp';");
				pw.println("</script>");
		}
		pw.close();
            
                      }
       
	
	}}
