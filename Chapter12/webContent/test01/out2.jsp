<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	<!--  ǥ�������� ��� -->
	<% if(name!=null || name.length()!=0) { %>
			<h1><%= name %> ,<%= age %> </h1>
	<%	} else { %>
			<h1>�̸��� �Է��ϼ���</h1>
	<% } %>
	
	<!--  out ��ü�� ��� -->
		
	<% if(name!=null || name.length()!=0) { %>
			<h1><% out.println(name+" , "+age); %> </h1>
	<% } else { %>
			<h1>�̸��� �Է��ϼ���</h1>
	<% } %>
	</body>
</html>