<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 세션과 어플리케이션 내장 객체에 바인딩
    String name=(String)session.getAttribute("name");
    String address = (String)session.getAttribute("address");
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>내장 객체 스코프 테스트2</title>
	</head>
	<body>
		이름은 <%= name %>입니다.<br>
		주소는 <%= address %>입니다.<br>
	</body>
</html>