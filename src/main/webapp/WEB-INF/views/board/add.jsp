<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 작성</h1>
	
	<form action="add.do" method="post">
	
	<div>
		제목을 입력하세요<br><input type="text" name="title"><br>
	</div>
	
	<div>
		내용을 입력하세요<br><input type="text" name="contents"><br>
	</div>
	
	<div>
		이름을 입력하세요<br><input type="text" name="name"><br>
	</div>
	
	<div>
		조회수 입력하세요<br><input type="number" name="views"><br>
	</div>
	
	<div>
				<input type="submit" value="등록" name="글 등록">
				<button type="submit">Add</button>
			</div>
			</form>
</body>
</html>