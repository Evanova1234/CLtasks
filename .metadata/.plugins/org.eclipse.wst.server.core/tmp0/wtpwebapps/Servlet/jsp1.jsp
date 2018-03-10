<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP1</title>
</head>
<body>

<%
	Date date = new Date(); 
	out.println(date+"<br>");
	out.println("Hello World");
%>

</body>
</html>