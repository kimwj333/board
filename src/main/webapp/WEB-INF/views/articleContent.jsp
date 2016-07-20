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
	<h1>글 내용</h1>
	<table>
		<tr>
			<td>articleNo</td>
			<td>articleWriter</td>
			<td>articleDate</td>
			<td>articleTitle</td>
			<td>articleContent</td>
		</tr>
		<c:if test="${articleo != null}">
			<tr>
				<td>${articleo.articleNo}</td>
				<td>${articleo.articleWriter}</td>
				<td>${articleo.articleDate}</td>
				<td>${articleo.articleTitle}</td>
				<td>${articleo.articleContent}</td>
			</tr>
		</c:if>
	</table>
</body>
</html>