package signup.page;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import guvi.dbhandler.Validate;

@WebServlet("/regi")
public class SignupServlet extends HttpServlet{
	public  void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String name=req.getParameter("name");
		String mail=req.getParameter("email");
		String pas=req.getParameter("password");
		String conf=req.getParameter("confirm");
		Validate.insertData(name, mail, pas, conf);
		resp.sendRedirect("Loginpage.jsp");
		
		
	}

}
