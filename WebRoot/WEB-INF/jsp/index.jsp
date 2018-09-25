<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"  %>
<!-- c:标签 -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- fmt:标签 -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>后台管理中心</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
</head>
<body style="background-color: #f2f9fd;">
<!-- 模块一 -->
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" /> 后台管理中心
			</h1>
		</div>
		<div class="head-l">
			<a class="button button-little bg-blue" href="./login.jsp"><span
				class="icon-power-off"></span> 退出登录</a>
		</div>
		
		<div class="head-l">		
			<a class="button button-little bg-blue" >欢迎您，<span>${sm.man_name}！</span>现在是：
			<c:set var="now" value="<%=new java.util.Date()%>" />
			<fmt:formatDate value="${now}" pattern="G yyyy年MM月dd日  E" type="both"/>
			</a>
		</div>
	
	</div>
<!-- 	模块二 -->
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		
		<h2>
			<span class="icon-user"></span>基本设置
		</h2>
		<ul style="display: block">
			<li><a href="showAllSysManager"
				target="right"><span class="icon-caret-right"></span>管理员管理</a></li>
				
			<li><a href="./addSysManager.jsp" target="right"><span
					class="icon-caret-right"></span>添加操作员</a></li>
					
			<li><a href="editSysManger?man_id=${sm.man_id}" target="right"><span
					class="icon-caret-right"></span>修改密码</a></li>
					
		</ul>
		
<!-- 		班级分区     ********************************************************************** -->		
		<h2>
			<span class="icon-pencil-square-o"></span>班级管理
		</h2>		
		<ul>
			<li><a href="showAllStuClass" target="right"><span
					class="icon-caret-right"></span>班级列表</a></li>
			<li><a href="./addStuClass.jsp" target="right"><span
					class="icon-caret-right"></span>添加班级</a></li>
			<li><a href="selectToShowStuClass.jsp" target="right"><span
					class="icon-caret-right"></span>查找班级</a></li>
		</ul>
<!-- 		学生分区     ********************************************************************** -->
		<h2>
			<span class="icon-pencil-square-o"></span>学生管理
		</h2>		
		<ul>
			<li><a href="showAllStudent" target="right"><span
					class="icon-caret-right"></span>学生列表</a></li>
			<li><a href="addStudent.jsp" target="right"><span
					class="icon-caret-right"></span>添加学生</a></li>
			<li><a href="selectToShowStudent.jsp" target="right"><span
					class="icon-caret-right"></span>查找学生</a></li>
		</ul>


	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		<li><a href="info.html" target="right" class="icon-home"> 首页</a>
		</li>
		<li><a href="##" id="a_leader_txt">网站信息</a></li>
	</ul>
	<div class="admin">
		<iframe src="index.html" name="right" width="100%" height="100%"></iframe>
	</div>

</body>
</html>
