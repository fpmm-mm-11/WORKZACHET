package org.jboss.as.quickstarts.helloworld;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;





/**
 * Created by Александр on 28.03.2015.
 */
@WebServlet("/do.test")
public class ServletTest extends HttpServlet {


    @Inject
    HelloService helloService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       // String name, surname, email, text, temp;
        System.out.println("Action='" + request.getParameter("action") + "'");
      /*  name = request.getParameter("name");
        surname = request.getParameter("surname");
        email = request.getParameter("email");
        text = request.getParameter("text");
        temp = "";
        Boolean success = true;
        Users ps1 = new Users();
        if (!name.equals(""))
            ps1.setName(name);
        else
        {
            temp += "Name field is empty!<br>";
            success = false;
        }
        if (!surname.equals(""))
            ps1.setSurname(surname);
        else
        {
            temp += "Surname field is empty!<br>";
            success = false;
        }
        if (!email.equals(""))
            ps1.setEmail(email);
        else
        {
            temp += "Email field is empty!<br>";
            success = false;
        }
        if (success)
            temp = "Your request is sent!";


        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();

        if (success)
            helloService.Save(ps1);
*/
        request.setAttribute("infoMessage","");
        String str1 = request.getParameter("action");
        if (str1.equals("Register")){
            RequestDispatcher resultView = request.getRequestDispatcher("index2.jsp");
            resultView.forward(request, response);}
        if (str1.equals("Back")){
            RequestDispatcher resultView = request.getRequestDispatcher("index.jsp");
            resultView.forward(request, response);}
        if (str1.equals("Send")){
            RequestDispatcher resultView = request.getRequestDispatcher("index3.jsp");
            resultView.forward(request, response);}
    }

}
