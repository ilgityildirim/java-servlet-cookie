import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class IndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Cookie Page</h1>");

        String login = request.getParameter("login");
        out.println("<strong>Login:</strong>&nbsp;" + login);

        Cookie cookie = new Cookie("login", login);
        cookie.setMaxAge(60 * 60 * 24); // 1 day
        response.addCookie(cookie);
    }
}