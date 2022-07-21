package usr;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "gugudan", urlPatterns = "/gugudan")
public class Gugudan extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Rq rq = new Rq(request, response);

        int dan = rq.getIntParam("dan", 0);
        int limit = rq.getIntParam("limit", 0);

        rq.appendBody("<h1>%d단</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }
//        int dan = Integer.parseInt(request.getParameter("dan"));
//        int limit = Integer.parseInt(request.getParameter("limit"));
//
//        response.getWriter().append("<h2> %d 단</h2>".formatted(dan));
//
//        for(int i = 1 ; i <=limit ; i++){
//            response.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
//        }

    }
}
