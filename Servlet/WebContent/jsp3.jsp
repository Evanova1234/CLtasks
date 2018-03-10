<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 

	String a = request.getParameter("a");
	String b = request.getParameter("b"); 
	Integer aNumeric = Integer.valueOf(a);
	Integer bNumeric = Integer.valueOf(b);
	
	out.print("<ul>");
	
	for(int i=aNumeric; i<=bNumeric; i++) {
		out.print("<li>"+i+"</li>");
	}
	
	out.print("</ul>");

%>


</body>
</html>