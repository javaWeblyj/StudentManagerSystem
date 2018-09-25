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
				var password = document.form1.password.value;
				var password2 = document.form1.password2.value;
				if(name == "") {
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
	<strong style="font-size: 20px">修改用户信息：</strong>
	<form name="form1" action="updateSysManager" method="post"
		onsubmit="return checkInput()" >
		
		<table class="table table-bordered table-hover m10"
			style="margin-left:10px;margin-top:3px;">			
			
			<tr>
				<td width="10%" class="tableleft">新姓名
				<input type="text" name="man_name" value="${sm.man_name}" id="name"> 
				</td>
				
				<td width="10%" class="tableleft">新密码
				<input type="text" name="man_psd" value="${sm.man_psd}" id="password">
				</td>
				
				<td width="10%" class="tableleft">确认密码
				<input type="text" type="password" name="man_psd2" id="password2" />
				</td>
			</tr>
			
			<tr>
				<input type="submit" value="更新修改" class="btn">
				<input type="hidden" value="${sm.man_id}" name="man_id">
			</tr>
		</table>
	</form>
				<p style="color: red">${error }</p>
</body>

</html>
