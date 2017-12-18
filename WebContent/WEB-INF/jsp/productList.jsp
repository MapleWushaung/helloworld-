<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px" cellspacing="0" align="center">
	<tr>
		<th></th>
		<th>商品名称</th>
		<th>商品价钱</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${products}" var = "p">
		<tr>
			<td><img src="${p.product_imgPath}" ></td>
			<td>${p.name}</td>
			<td>${p.price}</td>
			<td><a href = "DeleteProduct/${p.id}">删除</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>