<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="WEB-INF/errors/DivByZero.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dzielenie przez zero</title>
</head>
<body>

<% 
	
	int a = 4; 
	int b = 0; 
	out.print("Wynik dzielenia to : "+(a/b));

%>

</body>
</html>