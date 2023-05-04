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
		<title>표현식 연습</title>
	</head>
<body>
	<!--  표현식 -->
	<h1>안녕하세요 <%= name %>님!</h1>
	<h1>당신은 나이는 <%= age %>살입니다.</h1>
	<h1>키는 <%= 180 %>cm입니다.</h1>
	<h1>나이+10은 <%= Integer.parseInt(age) + 10 %>살입니다.</h1>
	<!--  age가 스트링이라서 10을 더할 수가 없으므로 integer로 바꾸어주어야 함 -->

</body>
</html>