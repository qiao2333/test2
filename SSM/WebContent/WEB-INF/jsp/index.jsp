
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

	Book book = ((Book)request.getAttribute("var"));

%>

 

	<table class="table">

		<tr class="td">

			<td>图书编号</td>

			<td>图书名称</td>

			<td>图书类别</td>

			<td>作者</td>

			<td>出版社</td>

			<td>入库日期</td>
			
			<td>添加日期</td>
			
			<td>库存量</td>
			
			<td>现存量</td>
			
			<td>价格</td>
		</tr>

<%if(book!=null){%>

		<tr class="td">

			<td><%=book.getBookno()%></td>

			<td><%=book.getBookname()%></td>

			<td><%=book.getBooksoft()%></td>

			<td><%=book.getAuthor()%></td>

			<td><%=book.getPress()%></td>

			<td><%=book.getPdate()%></td>
			
			<td><%=book.getAdate()%></td>
			
			<td><%=book.getMaxnumber()%></td>
			
			<td><%=book.getNumber()%></td>
			
			<td><%=book.getPrice()%></td>
		</tr>

	<%}else{ %>

		<tr class="td">

			<td style="color: red;">暂无相关数据</td>

		</tr>

<%} %>

	</table>

 

</body>

</html>
