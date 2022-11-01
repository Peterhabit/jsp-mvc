<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>요청의 시작점 : view </title>
</head>
<body>
<form action="controllers" method="post">
    이름 : <input type="text" name="pname" value="기본값"/>
    이메일 : <input type="text" name="pemail" value="@induk.ac.kr"/>
    <input type="submit" value="작업"/>
</form>
<a href="api/induk.jsp">contact 폼으로</a>
</body>
</html>
