package iducs.javaweb.fundmentals201712039.controller;

import iducs.javaweb.fundmentals201712039.model.MemberDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FormController", value = "/controllers")   // /는 Application context(앱어플리케이션의 시작) 위치 -> webapp
public class FormController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("there");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // 인코딩(or 디코딩) 을 맞게 설정
        System.out.println("here");
        //현재 requset 객체에는 두 개의 매개변수 pname, pemail 값이 저장되어 있음
        //System.out.println(request.getParameter("pemail")); // pemail 매개변수의 값을 가져와 출력
        //속성-속성값을 request 객체에 저장
       // request.setAttribute("work","등록");

        //나중에는 DBMS 또는 파일 등으로 부터 레코드들을 가져와서 처리됨
        //DTO : 데이터 전달 객체
        //DAO : 데이터를 접근 (DBMS에 질의 처리)
        MemberDTO mRef = new MemberDTO();
        mRef.setName(request.getParameter("pname"));
        mRef.setEmail(request.getParameter("pemail"));
        mRef.setWork("수정");
        // member 속성이름으로 mRef 참조하는 객체를 request 객체에 저장
        request.setAttribute("member", mRef);

        //request 객체의 getRequestDispatcher 메소드로 데이터 객체를 전달할 페이지(view) 접근
        //forward() 메소드로 request, response 객체 전달
        request.getRequestDispatcher("result-view.jsp").forward(request, response);
    }
}


