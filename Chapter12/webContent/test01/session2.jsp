<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // JSP에서는 자동으로 세션 객체를 생성하기에
    // 굳이 getSession() 매서드를 호출하여 session을 생성할 필요가 없다
    // 9장 HttpSession session = request.getSession();
    String name=(String)session.getAttribute("name");
    String address = (String)session.getAttribute("address");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session 내장 객체 테스트2</title>
	</head>
	
	<body>
		이름은 <%= name %>입니다.<br>
		주소는 <%= address %>입니다.<br>
	</body>
</html>