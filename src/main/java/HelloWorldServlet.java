import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    private int hitCount;

    //reset hitCount

    public void init() {
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        hitCount++;
        PrintWriter out = res.getWriter();
        if (name != null) {
            out.println("<h1>Hello, " + name + "!");
        } else {
            out.println("<h1>Hello, World!</h1></");
        }
    }
}
