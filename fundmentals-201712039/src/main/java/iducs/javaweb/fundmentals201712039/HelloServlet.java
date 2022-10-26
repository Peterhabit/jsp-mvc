package iducs.javaweb.fundmentals201712039;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/member/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    //객체를 생성할 때 한번 동작
    //서블릿 클래스로부터 서블릿 객체를 생성할 때 호출 -> 요청 올 때마다 서블릿 스레드를 생성 / 동작함
    public void init() {
        message = "Hello World!";
        System.out.println("one time"); // 콘솔 창에출력
    }

    //doGet과 doPost는 요청이 올때마다 처리
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();  // 웹 브라우저로 전송
                                                // 응답 객체로부터 출력 객체를 생성하여 출력
        out.println("<html><body>");
        out.println("<zh1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8"); //응답할 때(쓸 때) 인코딩
        request.setCharacterEncoding("UTF-8");  //읽어오는 것 인코딩, defalut ISO-8859-1

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + request.getParameter("p") + "</h1>");
        out.println("</body></html>");
    }

    //객체를 생성할 때 한번 동작
    public void destroy() {
    }
}