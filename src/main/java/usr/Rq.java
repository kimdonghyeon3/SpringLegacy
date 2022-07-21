package usr;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Rq {

    HttpServletRequest request;
    HttpServletResponse response;

    public Rq(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        this.request = request;
        this.response = response;
    }

    public int getIntParam(String str, int defaultValue) {

        String param = request.getParameter(str);

        if(param == null)
            return defaultValue;

        return Integer.parseInt(param);
    }

    public void appendBody(String str) throws IOException {
        response.getWriter().append(str);
    }
}
