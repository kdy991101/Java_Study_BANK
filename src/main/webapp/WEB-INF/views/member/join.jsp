<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Login Page</h1>
	
	<form action="join.do" method="post">
        <div>
            ID를 입력하세요<br> <input type="text" name="username"><br>
            PW를 입력하세요<br><input type="password" name="password"><br> 
            이름을 입력하세요<br><input type="text" name="name"><br>
            전화번호를 입력하세요<br><input type="tel" name="phone"><br>
            email을 입력하세요<br><input type="email" name="email"><brs>  
        </div>

        <div>
           <input type="checkbox" name="아이디 기억"><br>
            <input type="submit" value="회원가입">
            <input type="reset" value="초기화">
        </div>

       
    </form>

</body>
</html>