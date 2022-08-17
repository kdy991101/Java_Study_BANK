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

    
    <form action="./login.do" method="post">
    
        <div class="container">
            ID를 입력하세요<br> <input type="text" value="qwer" name="username" placeholder="아이디"><br>
            PW를 입력하세요<br><input type="password" value="wer" name="password" placeholder="비밀번호"><br> 
            
        </div>

        <div>
           로그인 상태 유지<input type="checkbox" name="로그인 상태 유지"><br>
            <input type="submit" value="로그인">
            <input type="reset" value="초기화">
        </div>

        <div>
            <a href="../study_index.html">index로 돌아가기</a><br>

            
        </div>
    </form>

</body>
</html>