<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
	
		<c:when test="${param.minimalAge>18}">Dozwolone od lat 18</c:when>
		<c:when test="${param.minimalAge<18}">Dozwolone do lat 18</c:when>
		<c:when test="${empty param.minimalAge}">Brak parametru</c:when>

	</c:choose>

</body>
</html>