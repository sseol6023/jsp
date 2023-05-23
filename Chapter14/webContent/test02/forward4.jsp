<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("UTF-8");
	// request 내장 객체에 바인딩
	request.setAttribute("id", "hong");
	request.setAttribute("pwd", "1234");
	// session 내장 객체에 바인딩
	session.setAttribute("name", "홍길동");
	// application 내장 객체에 바인딩
	application.setAttribute("email", "hong@test.com");
	//session에 address 속성이름으로 바인딩
	session.setAttribute("address", "부산시 사상구")
	
%>
<!-- session보다 request가 우선순위 -->

<html>
	<head>
	   <meta charset="UTF-8">
	   <title>forward1</title>
	</head>
	<body>
		<!-- 포워딩 -->
	    <jsp:forward page="member4.jsp" />
	</body>
</html>
