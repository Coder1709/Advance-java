import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pwriter=response.getWriter();
			String name=request.getParameter("username");
			String password=request.getParameter("userPassword");
			pwriter.print("Hello "+name);
			pwriter.print("Your Password is: "+password);
			Cookie c1=new Cookie("userName",name);
			Cookie c2=new Cookie("userPassword",password);
			response.addCookie(c1);
			response.addCookie(c2);
			pwriter.print("<br><a href='welcome'>View Details</a>");
			pwriter.close();
		}catch(Exception exp) {
			System.out.println(exp);
		}
	}
}
