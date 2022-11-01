package iducs201712039.javaweb.fundmentals;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() { // 서블릿 객체를 생성할 때
        message = "Hello World!";
        System.out.println("init()");
    }

    // 객체로 부터 생성된 스레드(객체)가 요청을 처리할 때
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        // 요청 객체에 저장된 매개변수의 값을 가져옴
        System.out.println(request.getParameter("fullname"));
        System.out.println(request.getParameter("email"));

        // about.jsp 로 전달하고 싶다.
        // PrintWriter 객체를 생성해서 HTML 문서를 생성할 것인가? 만들어져 있는 JSP 문서를 활용할 것인가?
        request.getRequestDispatcher("about.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8"); // ISO-8859-1 기본

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        System.out.println(request.getParameter("p"));
        out.println("<h1>" + request.getParameter("p") + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}