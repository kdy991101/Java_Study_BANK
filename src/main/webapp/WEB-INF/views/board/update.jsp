<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정 페이지</h1>
	<form action="update.do" method="post">
		
		<div>
			제목 : <input type="text" name="title" value="${detail.title}">
			</div>
			<div>
			내용 : <input type="text" name="comtents" value="${detail.contents}">
			</div>
			<div>
			이름 : <input type="text" name="name" value="${detail.name}">
			</div>
			<div>
			뷰 : <input type="number" name="views" value="${detail.views}">
			</div>
	<div>
		 <input type="submit" value="수정">
	</div>
	
	</form>

</body>
</html>