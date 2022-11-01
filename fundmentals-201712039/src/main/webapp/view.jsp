<%--
  Created by IntelliJ IDEA.
  User: IN302
  Date: 2022-11-01
  Time: 오후 4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%= "뷰 페이지"%>
<br/>
<%
    String[] baseball = (String[]) request.getAttribute("baseball");
    for(String b : baseball)
        out.println(b + "<br/>" );
%>
<c:forEach items ="${baseball}" var="ball">
    ${ball} <br/>
</c:forEach>
</body>
</html>
