<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="iducs201712039.javaweb.fundmentals.model.MemberDTO" %>
<html>
<head>
    <title>요청 처리 결과 view </title>
</head>
<body>
<h1>요청 처리 결과</h1>
<%-- 속성의 값이 MemberDTO 형의 객체 --%>
<%
    MemberDTO m = (MemberDTO) request.getAttribute("ref"); // request 가능, requestScope 오류
%>
<%= m.getName()%>님 <%= m.getWork()%> 에 성공했습니다.
<%-- pageScope -> requestScope -> sessionScope -> applicationScope --%>
이메일은(EL사용 - attribute를 잘 다룬다) : ${ref.email}
</body>
</html>
