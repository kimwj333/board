<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
	<h1>�Է�ȭ��</h1>
	<form action="/addArticle" method="post">
		<table>
			<tr>
				<td>Title : <input id="articleTitle" name="articleTitle" type="text"/></td>
				<td>Writer : <input id="articleWriter" name="articleWriter" type="text"/></td>
				<td>Pw : <input id="articlePw" name="articlePw" type="password"/></td>
			</tr>
		</table>
	<hr>
		<div>Content</div>
		<div>
			<textarea id="articleContent" name="articleContent"></textarea>
		</div>
		<button>�� ����ϱ�</button>
		
		<a href="/"><input type="button" value="Ȩ����"/></a>
		
	</form>
</body>
</html>