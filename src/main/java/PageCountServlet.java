import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

@WebServlet("/count")
public class PageCountServlet extends HttpServlet {
    int pageCountViews = 0;

    @Override
    protected void doGet(HttpServletResponse req, HttpServletResponse res) throws Servlet

    if (req.getParameter("reset") != null) {
        pageCountViews = 0;
    }
    pageCountViews +=1;
    System.out.println(pageCountViews);
}
