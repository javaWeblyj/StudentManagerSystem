<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'ShowAllStudent.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="content_Type" content="text/html;charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<style>
.img1:hover {
	width: 100px;
	height: 100px;
}
</style>

</head>

<body>
	<font color="#777777"><strong style="font-size: 20px">管理员信息：</strong>
	</font>
	<br>
	<table class="table table-bordered table-hover definewidth m10">
		<thead class="thead1">
			<tr>
				<th>账号</th>
				<th>密码</th>
				<th>姓名</th>
				<th>最后一次登录时</th>
				<th>编辑</th>
	            <th>删除</th>
			</tr>
		</thead>
		<c:forEach items="${sm}" var="s">
			<tr>
				<td><c:out value="${s.man_id }"></c:out> </td>
				<td><c:out value="${s.man_psd }"></c:out> </td>
				<td><c:out value="${s.man_name }"></c:out> </td>
				<td><c:out value="${s.man_login }"></c:out> </td>
				
				<td><a href="editSysManger?man_id=${s.man_id}">编辑</a></td>
	            <td><a href="deleteSysManger?man_id=${s.man_id}">删除</a></td>
			</tr>

		</c:forEach>
	</table>
		<div style="text-align:center">
					<a href="showAllSysManager?start=0">首   页</a>					
					<a href="showAllSysManager?start=${page.start-page.count}">上一页</a>
					<a href="showAllSysManager?start=${page.start+page.count}">下一页</a>
					<a href="showAllSysManager?start=${page.last}">尾   页</a>					
		</div>
</body>
</html>
