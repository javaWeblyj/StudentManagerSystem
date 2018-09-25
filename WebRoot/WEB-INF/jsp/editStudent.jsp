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
				
				var cId = document.form1.cId.value;
				var name = document.form1.name.value;
				var address = document.form1.address.value;	
				var age = document.form1.age.value;	
				var sex = document.form1.sex.value;		
				if(cId == "") {
					alert("请输入班级编号!");
					return false;
				} else if(name == "") {
					alert("请输入学生姓名!");
					return false;
				} else if(age == "") {
					alert("请输入年龄!");
					return false;
				} else if(sex == "") {
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
	<strong style="font-size: 20px">修改学生信息：</strong>
	<form name="form1" action="updateStudent" method="post"
		onsubmit="return checkInput()" >
		
		<table class="table table-bordered table-hover m10"
			style="margin-left:10px;margin-top:3px;">			
			
			<tr>
				<td width="10%" class="tableleft">班级编号
				<input type="text" name="c_id" value="${st.c_id}" id="cId"> 
				</td>
				
				<td width="10%" class="tableleft">姓名
				<input type="text" name="stu_name" value="${st.stu_name}" id="name">
				</td>
				
				<td width="10%" class="tableleft">年龄
				<input type="text" name="stu_age" value="${st.stu_age}" id="age" />
				</td>
			</tr>
			
			<tr>
				<td width="10%" class="tableleft">性别
				<input type="text" name="stu_sex" value="${st.stu_sex}" id="sex"> 
				</td>
				
				<td width="10%" class="tableleft">地址
				<input type="text" name="stu_address" value="${st.stu_address}" id="address">
				</td>
			</tr>
			
			<tr>
				<input type="submit" value="更新修改" class="btn">
				<input type="hidden" value="${st.stu_id}" name="stu_id">
			</tr>
		</table>
	</form>
				<p style="color: red">${error }</p>
</body>

</html>
