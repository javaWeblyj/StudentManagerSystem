<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	  href="${pageContext.request.contextPath}/css/bootstrap.css" />
<style type="text/css">
body {
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

.btn {
	position: absolute;
	top: 50%;
	left: 40%;
	color: blue;
	font-size: 20px;
}
</style>
<script type="text/javascript">
			function checkInput() {
				var name = document.form1.name.value;
				var introduce = document.form1.introduce.value;
				
				if(name == "") {
					alert("请输入姓名!");
					return false;
				} else if(introduce == "") {
					alert("请输入简介!");
					return false;
				} else
				{
					return true;
				}
			}
</script>
</head>

<body>
	<strong style="font-size: 20px">修改班级信息：</strong>
	<form name="form1" action="updateStuClass" method="post"
		onsubmit="return checkInput()" >
		
		<table class="table table-bordered table-hover m10"
			style="margin-left:10px;margin-top:3px;">			
			
			<tr>
				<td width="10%" class="tableleft">新班级名称
				<input type="text" name="class_name" value="${sc.class_name}" id="name"> 
				</td>
				
				<td width="10%" class="tableleft">新简绍
				<input type="text" name="class_introduce" value="${sc.class_introduce}" id="introduce">
				</td>
				
				</td>
			</tr>
			
			<tr>
				<input type="submit" value="更新修改" class="btn">
				<input type="hidden" value="${sc.class_id}" name="class_id">
			</tr>
		</table>
	</form>
				<p style="color: red">${error }</p>
</body>

</html>
