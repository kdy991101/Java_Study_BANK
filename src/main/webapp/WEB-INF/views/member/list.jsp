<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Member List Page</h1>
	<table border="1">
		<thead>
			<tr>
				<th>UserName</th><th>Name</th>
				<th>phone</th><th>Email</th>
			</tr>
		</thead>
		
		<tbody>
		<%-- for(int i; i<=10; i=i+2) --%>
			<%-- <c:forEach begin="0" end="10" var="i" step="2">
				<h3>${pageScope.i}</h3>
			</c:forEach> --%>
			
			<c:forEach items="${requestScope.list}" var="dto">
				<tr>
					<td>${pageScope.dto.username}</td>
					<td>${pageScope.dto.name}</td>
					<td>${pageScope.dto.email}</td>
					<td>${pageScope.dto.phone}</td>
				</tr>
			
			</c:forEach>
		
<%--			 <% for(BankMembersDTO bankMembersDTO : ar){ %>
				<tr>
						<td><%= bankMembersDTO.getUsername() %> </td>
						<td><%= bankMembersDTO.getName() %></td>
						<td><%= bankMembersDTO.getPhone() %></td>
						<td><%= bankMembersDTO.getEmail() %></td>
				</tr>
				
				<%} %>
 --%>
 
		</tbody>
	</table>
</body>
</html>