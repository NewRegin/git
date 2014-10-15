<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.text.SimpleDateFormat"%>
    <%@page import="java.util.Date"%>
    <%@page import="java.sql.*"%>
<%@page import="action.ConnDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:white">

<center><img src="1.jpg"><br><br><br>
 	<form name="Form" action="GetBook" method="post">
   	<h2 align="center">请输入查询目标（作者）：
	   	<input type = "text" name = "author" size = "45%" style=height:25px>	&nbsp;&nbsp;
	    <input type = "submit" value = "Search" name="Sub" style="width: 85px; height: 30px;"  >
    </h2>
    </form>
   
    </center>
</body>
</html>