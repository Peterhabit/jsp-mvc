package iducs201712039.javaweb.fundmentals.controller;

import iducs201712039.javaweb.fundmentals.model.MemberDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FormController", value = "/controllers")
public class FormController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //teams가 DB에서 가져온 정보라고 가정
        String[] teams = {"삼성라이온즈", "두산베어스", "기아타이거즈", "SSG랜더스", "키움히어로즈"};
        String[] processedTeams = new String[teams.length];
        for(int i = 0; i < 5; i ++)
            processedTeams[i] = (i+1) + ":"+ teams[i];

        request.setAttribute("baseball", processedTeams); // 속성(attribute)으로 설정 (속성이름, 속성값)

        request.getRequestDispatcher("view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // 인코딩 (or 디코딩)을 맞게 설정
        System.out.println("here");
        // 현재 request 객체에는 두 개의 매개변수 pname, pemail 값이 저장되어 있음
        //System.out.println(request.getParameter("pemail")); // pemail 매개변수의 값을 가져와 출력
        // 속성-속성값을 request 객체에 저장
        //request.setAttribute("work", "등록");

        // DBMS 또는 파일 등으로 부터 레코드들을 가져와서 처리됨
        // DTO (Data Transfer Object) : 데이터 전달 객체
        // DAO (Data Access Object) : 데이터를 접근 (DBMS에 질의 처리)
        MemberDTO mRef = new MemberDTO();
        mRef.setName(request.getParameter("pname"));
        mRef.setEmail(request.getParameter("pemail"));
        mRef.setWork("수정");
        // member 속성이름으로 mRef 참조하는 객체를 request 객체에 저장
        request.setAttribute("ref", mRef);
        // request 객체의 getRequestDispatcher 메소드로 데이터 객체를 전달할 페이지(view) 접근
        // forward() 메소드로 request, response 객체 전달
        request.getRequestDispatcher("result-view.jsp").forward(request, response);
    }
}
