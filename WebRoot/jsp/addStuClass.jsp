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
				var account = document.form1.account.value;
				var name = document.form1.name.value;
				var password = document.form1.password.value;
				var password2 = document.form1.password2.value;
				if(account == "") {
					alert("请输入管理员账号!");
					return false;
				} else if(name == "") {
					alert("请输入姓名!");
					return false;
				} else if(password == "") {
					alert("请输入密码!");
					return false;
				} else if(password2 == "") {
					alert("请确认密码!");
					return false;
				} else if(password!=password2){
					alert("两次密码不一致!");
					return false;
				}else
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
				<td><input type="text" name="man_id" id="account" />
				</td>
				<td class="tableleft">班级名称</td>
				<td><input type="text" name="man_name" id="name" />
				</td>
				<td class="tableleft">班级简介</td>
				<td><input type="text" name="man_login" id="name" />
				</td>
			</tr>		
			<input type="submit" value="提交" class="btn" />
	</form>
				<p style="color: red">${error }</p>
</body>

</html>