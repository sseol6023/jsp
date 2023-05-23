<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  request.setCharacterEncoding("UTF-8");
%> 
<!-- 관리자로 로그인admin 했는지 알아보는 제스피 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결과창</title>
	</head>
	<body>
		<c:if test="${empty param.userID }">
			아이디를 입력하세요.<br>
			<a href="login.jsp">로그인 창 </a>
		</c:if>
		
		<!-- 아이디를 입력했을 때 -->
		<c:if test="${not empty param.userID }">
			<!-- 관리자로 로그인 했을 때 -->
			<c:if test="${param.userID == 'admin' }">
			<h1>관리자로 로그인하였습니다.</h1>
			</c:if>
			
			<!-- 관리자가 아닐 때 -->
			<c:if test="${param.userID != 'admin' }">
				<h1>환영합니다. <c:out value="${param.userID }" />님!!!</h1>
			</c:if>
		</c:if>
	</body>
</html>