<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>

<%! Date date = new Date(); %>c 
<%-- ta data jest statyczna i aktualizowana przy restarcie serwera --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP1</title>
</head>
<body>

<%
	
	out.println(date+"<br>");
	out.println("Hello World");
%>

</body>
</html>