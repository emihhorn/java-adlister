import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/choose-color")
public class CounterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String output = "";
        output += "<h1>Enter a color below: </h1>";
        output += "<form action = '/choose-color' method = 'POST'>";
        output += "<input name = 'color' placeholder = 'Color here...'/>";
        output += "</form>";
        out.println(output);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        System.out.println(color);
        if(color != null) {
            response.sendRedirect("/view-color");
        } else {
            response.sendRedirect("/choose-color");
        }
    }

    }

