<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${title}</h1>
<br><br><br>
	<h2>作者、书籍详细信息</h2>
	<ul>
		<li>AuthorName ： ${author[0]}</li>
		<li>uthorCountry ： ${author[1]}</li>
		<li>uthorAge ： ${author[2]}</li>
		<li>AuthorID ： ${author[3]}</li>
		
		
		<li>BookISBN ：   ${book[0]}</li>
		<li>BookPublisher ：     ${book[1]}</li>
		<li>BookPublishDate ： ${book[2]}</li>
		<li>BookPrice ：：       ${book[3]}</li>
		<li>AuthorID ： ${book[4]}</li>
	</ul>
</body>
</html>