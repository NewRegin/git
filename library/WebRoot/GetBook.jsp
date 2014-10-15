<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri = "/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'result.jsp' starting page</title>
    </head>
 <body>
  <br>
  <center>
  <h2>查询${author}所写的图书结果</h2>
  <br><br><br><br>
    <table align="center" border="2" cellspacing="0" cellpadding="0" width="400">
    <tr align="center" valign="middle">
    	<td><b>书名</b></td>
    	<td><b>详细信息</b></td>
    	<td><b>删除</b></td>
    </tr>
    <c:forEach  var="bookname" items="${bookname}" begin = "0" end = "${num}" varStatus="status">
    	<tr align="center" valign="middle">
    	<!-- 书籍的详细信息 -->
    	<td>${bookname}</td>
    	<td>
	    	<form action="DetailInf" method="post">
	    		<input type = "hidden" name = "authorid" value = "${authorid}">
	    		<input type = "hidden" name = "title" value = "${bookname}">
	    		<input type = "submit" name = "sub" value = "详细信息" style="width:85px; height: 35px;"></form>
	    </td>
	    <td>
	    	<!-- 删除该书 --><form action="DeteleBook" method="post">
	    		<input type = "hidden" name = "title" value = "${bookname}">
	    		<input type = "submit" name = "sub" value = "  删 除  " style="width:60px; height:35px;">
	    	</form>
	    </td>
    	</tr>
    </c:forEach>
    </table> 
  </center> 
  </body>
</html>

