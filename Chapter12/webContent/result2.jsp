<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("user_id");
    String pwd = request.getParameter("user_pwd");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>결과 출력창</title>
</head>

<body>
	<%
		if(id == null || id.length() == 0)
		{
	%>
			아이디를 입력하세요.<br>
			<a href="/Chapter12/login.html"> 로그인하기</a>
	<%
		} else {	// 아이디를 입력한 경우
			if (id.equals("admin"))
			{
	%>
			<h2>관리자로 로그인했습니다.</h2>
	<%
			} else {
	%>
			<h2><%= id %>님 환영합니다.</h2>
	<%
			}
		}
	%>
</body>
</html>