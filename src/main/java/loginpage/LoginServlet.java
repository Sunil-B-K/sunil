package loginpage;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/logi")
public class LoginServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
	 String ema=req.getParameter("email");  
	 String pase=req.getParameter("password");
    boolean login_status= Vail.validateData(ema, pase);
    if(login_status==true) {
    	
    	resp.sendRedirect("profile.jsp");
}
    else {
    	
    	resp.sendRedirect("Loginpage.jsp");
}
		}

}

