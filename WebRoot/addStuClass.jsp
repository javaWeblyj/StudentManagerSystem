<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
				var classId = document.form1.classId.value;
				var name = document.form1.name.value;
				var introduce = document.form1.introduce.value;				
				if(classId == "") {
					alert("请输入班级编号!");
					return false;
				} else if(name == "") {
					alert("请输入班级名称!");
					return false;
				} else if(introduce == "") {
					alert("请输入班级简介!");
					return false;
				} else
				{
					return true;
				}
			}
		</script>
</head>

<body>
	<strong style="font-size: 20px">添加班级：</strong>
	<form name="form1" action="addStuClass" method="post"
		onsubmit="return checkInput()" >
		
		<table class="table table-bordered table-hover m10"
			style="margin-left:10px;margin-top:3px;">
			<tr>
				<td class="tableleft">班级编号</td>
				<td><input type="text" name="class_id" id="classId" />
				</td>
				<td class="tableleft">班级名称</td>
				<td><input type="text" name="class_name" id="name" />
				</td>
				<td class="tableleft">班级简介</td>
				<td><input type="text" name="class_introduce" id="introduce" />
				</td>
			</tr>
			
				<input type="submit" value="提交" class="btn" />
	</form>
				<p style="color: red">${error }</p>
</body>

</html>