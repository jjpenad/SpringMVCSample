<%@page import="tech.awakelab.SpringMVCSample.model.beans.ProductoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>

<h1>Sample JSP</h1>


<table class="table">
<thead>
	<tr>
		<th>Id</th>
		<th>Nombre</th>
		<th>Precio</th>
	</tr>
</thead>

<tbody>
 
	<c:forEach var="p" items="${productos}">
		<tr>
				<td><c:out value="${p.getId()}"></c:out></td>
				<td><c:out value="${p.getName()}"></c:out></td>
				
				<td>
					<fmt:setLocale value="es_CL"/>
					<fmt:formatNumber type="currency" value="${p.getPrice()}"></fmt:formatNumber>
				</td>
		</tr>
	</c:forEach>

</tbody>


</table>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>

</body>
</html>