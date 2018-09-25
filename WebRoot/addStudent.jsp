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
				var stuId = document.form1.stuId.value;
				var cId = document.form1.cId.value;
				var stuName = document.form1.stuName.value;
				var address = document.form1.address.value;	
				var stuAge = document.form1.stuAge.value;	
				var stuSex = document.form1.stuSex.value;		
				if(cId == "") {
					alert("请输入班级编号!");
					return false;
				} else if(stuName == "") {
					alert("请输入学生姓名!");
					return false;
				} else if(stuId == "") {
					alert("请输入学号!");
					return false;
				} else if(stuAge == "") {
					alert("请输入年龄!");
					return false;
				} else if(stuSex == "") {
					alert("请输入性别!");
					return false;
				} else if(address == "") {
					alert("请输入地址!");
					return false;
				} else
				{
					return true;
				}
			}
		</script>
</head>

<body>
	<strong style="font-size: 20px">添加学生：</strong>
	<form name="form1" action="addStudent" method="post"
		onsubmit="return checkInput()" >
		
		<table class="table table-bordered table-hover m10"
			style="margin-left:10px;margin-top:3px;">
			<tr>
				<td class="tableleft">学号</td>
				<td><input type="text" name="stu_id" id="stuId" />
				<td class="tableleft">班级编号</td>
				<td><input type="text" name="c_id" id="cId" />
				<td class="tableleft">姓名</td>
				<td><input type="text" name="stu_name" id="stuName" />
			</td>
			<tr>
				<td class="tableleft">年龄</td>
				<td><input type="text" name="stu_age" id="stuAge" />
				<td class="tableleft">性别</td>
				<td><input type="text" name="stu_sex" id="stuSex" />
				</td>
				<td class="tableleft">地址</td>
				<td><input type="text" name="stu_address" id="address" />
				</td>
			
			</tr>
			
				<input type="submit" value="提交" class="btn" />
	</form>
				<p style="color: red">${error }</p>
</body>

</html>