<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  스크립트 작성 -->
<% 
/*
String age = request.getParameter("age"); 
*/
%>

<!DOCTYPE html>
<!-- html 주석문입니다 -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>주석문 연습</title>
	</head>
<body>
	<!--  표현식 -->
	<h1>주석문 예제입니다</h1>
	<!--  <h1>나이+10은 <%-- <%= Integer.parseInt(age) + 10 %> --%> 살입니다.</h1> -->
	<%-- <%= Integer.parseInt(age) + 10 %> --%>
	<!--  age가 스트링이라서 10을 더할 수가 없으므로 integer로 바꾸어주어야 함 -->

</body>
</html>