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

<title></title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

<style type="text/css">
body {
	font-size: 20px;
	font-size: 20px;
	padding-bottom: 40px;
	background-color: white;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) { /* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>

<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>

<script type="text/javascript">
			function checkInput() {
				var temp = document.form1.classId.value;
				if(temp == "") {
					alert("请输入班级编号!");
					return false;
				} else {
					return true;
				}
			}
		</script>
</head>

<body>
	<font color="#777777"><strong style="font-size: 20px">学生信息：</strong>
	</font>
	<br>
	<table class="table table-bordered table-hover definewidth m10">
		<thead class="thead1">
			<tr>
				<th>学号</th>
				<th>班级编号</th>
				<th>姓名</th>
				<th>年龄</th>
	            <th>性别</th>
	            <th>地址</th>
				<th>编辑</th>
	            <th>删除</th>
			</tr>
		</thead>
		<c:forEach items="${st}" var="s">
			<tr>
				
				<td><c:out value="${s.stu_id }"></c:out> </td>
				<td><c:out value="${s.c_id }"></c:out> </td>
				<td><c:out value="${s.stu_name }"></c:out> </td>
				<td><c:out value="${s.stu_age }"></c:out> </td>
				<td><c:out value="${s.stu_sex }"></c:out> </td>
				<td><c:out value="${s.stu_address }"></c:out> </td>
				
				<td><a href="editStudent?stu_id=${s.stu_id}">编辑</a></td>
	            <td><a href="deleteStudent?stu_id=${s.stu_id}">删除</a></td>
			</tr>

		</c:forEach>
	</table>	
</body>
</html>






















