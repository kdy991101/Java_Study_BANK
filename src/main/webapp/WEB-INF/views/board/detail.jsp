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
		<h1>Board Detail</h1>
		<a href="./list.do">글 목록</a>
		<a href="./update.do?num=${detail.num}">수정</a>
		<a href="delete.do?num=${detail.num}">삭제</a>	
			
<table border="1">
	<thead>
		<tr>
			<th>num</th><th>title</th><th>contents</th><th>name</th><th>date</th><th>views</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${detail.num}</td>
			<td>${detail.title}</td>
			<td>${detail.contents}</td>
			<td>${detail.name}</td>
			<td>${detail.date}</td>
			<td>${detail.views}</td>
		</tr>
	</tbody>
</table>
</body>
</html>