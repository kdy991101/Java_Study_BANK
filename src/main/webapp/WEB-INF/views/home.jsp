<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test="${empty sessionScope.member}">
<a href="./member/login.do">로그인</a>
<a href="./member/join.do">회원가입</a>
<a href="./member/search.do">아이디 검색</a>
<a href="./bankbook/list.do">상품리스트</a>
<a href="./board/list.do">글 목록</a>
<a href="./board/detail.do">글 상세</a>
<!-- <a href="./bankbook/detail">detail</a> -->
<!-- <a href="./member/list">리스트</a> -->
</c:if>

<c:if test="${not empty sessionScope.member}">
<h3>${sessionScope.member.name} 님 환영합니다</h3>
<a href="./bankbook/list.do">상품리스트</a>
<a href="./member/logout.do">로그아웃</a>
<a href="./board/update.do">수정</a>
<a href="#">My page</a>
 </c:if>

</body>
</html>