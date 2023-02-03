

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstcalc
 */
@WebServlet("/firstcalc")
public class firstcalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstcalc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("n1"));
		int num2=Integer.parseInt(request.getParameter("n2"));
		if(request.getParameter("r1")!=null){
			out.println("<h3>Addition= <h3>"+(num1+num2));
		}
		else if(request.getParameter("r2")!=null){
			out.println("<h3>Subtraction= <h3>"+(num1-num2));
		}
		else if(request.getParameter("r3")!=null){
			out.println("<h3>Multiply= <h3>"+(num1*num2));
		}
		else if(request.getParameter("r4")!=null){
			out.println("<h3>Divide= <h3>"+(num1/num2));
		}
	
	}

}
