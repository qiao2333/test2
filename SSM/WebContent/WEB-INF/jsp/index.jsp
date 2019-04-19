
<%@ page language="java" contentType="text/html; charset=utf-8"

    pageEncoding="utf-8"%>

<%@page import="com.pojo.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>

<style type="text/css">

	.td td{

		width: 100px;

	}

	.table{

		text-align: center;

		margin: 0 auto;

	}

</style>

</head>

<body>

<%

	User user = ((User)request.getAttribute("var"));

%>

 

	<table class="table">

		<tr class="td">

			<td>编号</td>

			<td>用户名</td>

			<td>密码</td>

			<td>用户类型</td>

			<td>删除</td>

			<td>创建日期</td>
		
		</tr>

<%if(user!=null){%>

		<tr class="td">

			<td><%=user.getId()%></td>

			<td><%=user.getUserName()%></td>

			<td><%=user.getUserPassword()%></td>

			<td><%=user.getUserType()%></td>

			<td><%=user.getHasdelete()%></td>

			<td><%=user.getCreateDate()%></td>
			
		</tr>

	<%}else{ %>

		<tr class="td">

			<td style="color: red;">暂无相关数据</td>

		</tr>

<%} %>

	</table>

 

</body>

</html>
