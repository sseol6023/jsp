<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 세션과 어플리케이션 내장 객체에 바인딩
    session.setAttribute("name", "최설아");
    application.setAttribute("address", "부산시 사상구");
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>내장 객체 스코프 테스트1</title>
	</head>
	<body>
		<h1>이름과 주소를 저장합니다.</h1>
		<a href=appTest2.jsp>두번째 웹 페이지로 이동</a>
	</body>
</html>