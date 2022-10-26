<%@ page import="iducs.javaweb.fundmentals201712039.model.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>요청 처리 결과 view</title>
</head>
<body>
<h1>요청 처리 결과</h1>
<%--속성의 값이 MemberDTO 형의 객체--%>
<%
    MemberDTO m = (MemberDTO) request.getAttribute("member"); //request 가능, requestScope 오류
%>
<%= m.getName()%>님 <%= m.getWork()%>에 성공했습니다.

<%--pageScope, requestScope, sessionScope, applicationScope를 확인한다--%>
이메일은(EL사용 - attribute를 잘 다룬다): ${member.email}
<%-- ${requestScope.member.email} member앞에 requestScope 생략가능 --%>

</body>
</html>
