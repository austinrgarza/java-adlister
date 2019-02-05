import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;





@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        //writing it
        PrintWriter out = response.getWriter();

        //getting param passed with get request
        String name = request.getParameter("name");
        if (name == null) {
            name = "World";
        }
        String output = "<h1>Hello, " + name + "!</h1>";

        //outputs info
        out.println(output);

    }
}
