import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HitCounterServlet", urlPatterns = "/counter")
public class HitCounter extends HttpServlet {
    int counter = 0;

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        counter++;

//        String reset = request.getParameter("reset");
//        if (reset != null && request.equals("true")){
//            counter = 0;
//        }
        String result = "<h1>You've viewed this page " + counter + " times.</h1><img src=\"https://cdn3.movieweb.com/i/article/lJjiE0xyYIqFJktNIzQS8lJiGn0zCY/798:50/Owen-Wilson-Say-Wow-Tribute-Australia.jpg\"> ";
        out.println(result);
    }


}