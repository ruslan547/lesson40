package by.itClass.servlets;

import by.itClass.entity.FormValues;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", urlPatterns = {"/myServlet"})
public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/response.jsp");
        FormValues formValues = null;

        String firstParam = request.getParameter("first-param");
        String secondParam = request.getParameter("second-param");
        String[] thirdParams = request.getParameterValues("third-param");
        String checkbox1 = request.getParameter("checkbox1");
        String checkbox2 = request.getParameter("checkbox2");
        String checkbox3 = request.getParameter("checkbox3");
        String radio = request.getParameter("radio");

        formValues = new FormValues(firstParam, secondParam, thirdParams, checkbox1, checkbox2, checkbox3, radio);

        request.setAttribute("formValues", formValues);
        dispatcher.forward(request, response);
    }

}
