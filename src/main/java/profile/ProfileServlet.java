package profile;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import guvi.dbhandler.Validate;
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String age=req.getParameter("age");
		String mobile=req.getParameter("mobile");
		String date=req.getParameter("date");
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		Validate.insert(age,mobile, date, address, gender);
		resp.sendRedirect("home.jsp");
		
	}

}
