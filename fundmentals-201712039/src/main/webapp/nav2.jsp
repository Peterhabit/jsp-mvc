<%--
  Created by IntelliJ IDEA.
  User: IN302
  Date: 2022-11-01
  Time: 오후 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- HTML 주석: Tomcat에서 처리하고, 웹브라우저에서 처리 안함-->
<%-- jsp 주석: Tomcat에서 처리를 안함--%>
<%-- Scriptlet: JSP 문서를 구성하는 스크립팅 요소 중 하나
Java문법을 기준으로, JSP 기본 객체를 사용하여 프로그래밍 할 수 있다--%>
<%-- JSP 문서를 구성하는 스크립팅 요소: scriptlet, expresstion, declaration --%>
<%
    //Java 주석
    String[] teams = {"삼성라이온즈", "두산베어스", "기아타이거즈", "SSG랜더스", "키움히어로즈"};
    //out - JSP 기본 객체(Internal Object), System.out != out
    //System.out 콘솔, out 웹브라우저

    // for statement
    for(int i =0; i<teams.length; i++)
        out.println(teams[i] + "<br/>");

    // enhanced loop statement, enhanced for statement : sequential access (순차 접근할 떄 간결하게 사용가능)
    for(String team : teams)
        out.println(team + "<br/>");
    System.out.println("LG트윈스");


%>
</body>
</html>
