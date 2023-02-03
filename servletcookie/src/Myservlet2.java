

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class Myservlet2
 */
@WebServlet("/Myservlet2")
public class Myservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pwriter=response.getWriter();
			//Reading Cookie
			javax.servlet.http.Cookie[] c=request.getCookies();
			//Displaying username value from cookie
			pwriter.print("Name: "+c[1].getValue());
			//Displaying user password value from cookie
			pwriter.print("Password: "+c[2].getValue());
			pwriter.close();
		}
		catch(Exception exp) {
			System.out.println(exp);
			
		}
	}



}
