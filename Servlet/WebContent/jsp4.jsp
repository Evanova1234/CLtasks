<%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	String km = request.getParameter("km");
	Double kmNumeric = Double.valueOf(km);
	Double miNumeric = kmNumeric * 0.62137; 
	out.print("Wartość w milach to: "+miNumeric);
%>

</body>
</html>