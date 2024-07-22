<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>
	<jsp:include page="../welcom.jsp"></jsp:include>
	<h1>La liste des users </h1>
	<br>
	<br>
	<div class="container">
		<table class="table table-bordered table-hover table-secondary">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="user">
					<tr>
					<td>${user.id }</td>
					<td>${user.nom }</td>
					<td>${user.prenom }</td>
					<td>${user.email }</td>
				</tr>
				</c:forEach>
				
			</tbody>
		</table>
	</div>
</body>
</html>