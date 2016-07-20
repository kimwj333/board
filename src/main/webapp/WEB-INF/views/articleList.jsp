<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
	table, tr, td {
		border : 1px solid;
		border-color: black;
		text-align: center;
	}
</style>
</head>
<body>
	<a href="/">HOME</a>
	<h1>리스트</h1>
	<c:forEach var="a" items="${articleList}">
			<table>
				<tr>
					<td>${a.articleNo}</td>
					<td><a href="/articleContent?article=${a.articleNo}">${a.articleTitle}</a></td>
					<td>${a.articleDate}</td>
					<td>${a.articleWriter}</td>
				</tr>
			</table>
		</c:forEach>
	
		<hr>
			<form action="/articleList" method="GET">
				검색어 : 
				<input type="text" name="word">
				<button>검색</button>
			</form>
		</hr>
		
		<c:if test="${page>1}">
			<a href="/articleList?page=${page-1}">이전</a>
		</c:if>
		<c:if test="${page<lastPage}">
			<a href="/articleList?page=${page+1}">다음</a>
		</c:if>
</body>
</html>