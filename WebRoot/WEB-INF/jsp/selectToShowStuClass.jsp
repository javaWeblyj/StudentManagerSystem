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
	<font color="#777777"><strong style="font-size: 20px">班级信息：</strong>
	</font>
	<br>
	<table class="table table-bordered table-hover definewidth m10">
		<thead class="thead1">
			<tr>
				<th>班级编号</th>
				<th>班级名称</th>
				<th>班级简介</th>
				<th>编辑</th>
	            <th>删除</th>
			</tr>
		</thead>
		<c:if test="${sc!= null }" var="result">
			<tr>
				
				<td><c:out value="${sc.class_id }"></c:out> </td>
				<td><c:out value="${sc.class_name }"></c:out> </td>
				<td><c:out value="${sc.class_introduce }"></c:out> </td>
				
				<td><a href="editStuClass?classId=${sc.class_id}">编辑</a></td>
	            <td><a href="deleteStuClass?classId=${sc.class_id}">删除</a></td>
			</tr>

		</c:if>
	</table>	
</body>
</html>






















