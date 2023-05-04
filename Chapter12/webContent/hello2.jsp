<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--  선언문 작성 -->
<%!
	String name = "최설아";
	public String getName() {
		return name;
	}
%>

<!--  스크립트 작성 -->
<% String age = request.getParameter("age"); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>스크립트릿 연습</title>
	</head>
<body>
	<!--  표현식 -->
	<h1>안녕하세요 <%= name %>님!</h1>
	<h2>당신은 나이는 <%= age %>살입니다.</h2>

</body>
</html>