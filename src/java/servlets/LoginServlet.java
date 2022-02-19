
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author Manpreet
 */
public class LoginServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session= request.getSession();
        User luser= (User) session.getAttribute("username");
        
        if(luser==null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        else
        {
            
            response.sendRedirect("home");
            return;
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String username=request.getParameter("user");
            String password=request.getParameter("pass");
            
            HttpSession session=request.getSession();
            
            AccountService alloweduser=new AccountService();
            User luser= alloweduser.login(username, password);
            
            if(luser==null)
            {
                request.setAttribute("invalid","Invalid Credentials");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                return;
            }
            else
            {
                session.setAttribute("user", luser);
                response.sendRedirect("home");
                return;
            }
    }

   
}
