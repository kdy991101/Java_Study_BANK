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
	<h1>Board List</h1>
		<a href="./add.do">글 등록</a>
	<table border="1">
		<thead>
			<tr>
				<th>num</th>
				<th>title</th>
				<th>contents</th>
				<th>name</th>
				<th>date</th>
				<th>views</th>
			</tr>
		</thead>
		
		<tbody>
		
		<c:forEach items="${requestScope.list}" var="list">
		
		<tr>
			<td>${list.num}</td>
			<td><a href = "detail.do?num=${num}">${list.title}</a></td>
			<td>${list.contents}</td>
			<td>${list.name}</td>
			<td>${list.date}</td>
			<td>${list.views}</td>
		</tr>
		</c:forEach>
	</tbody>			
<%-- <tbody>	
				<c:forEach items="${requestScope.list}" var="do">
				
				<tr>
					<td><a href ="detail.do?num=${do.num}">${do.name}</a></td>
				
				</tr>
			
			</c:forEach>
		</tbody> --%>

</table>
</body>
</html>
