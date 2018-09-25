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
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<style>
.img1:hover {
	width: 100px;
	height: 100px;
}
</style>


<script type="text/javascript">
	 function batchDeletes(){
               //判断至少写了一项
               var checkedNum = $("input[name='subcheck']:checked").length;
               if(checkedNum==0){
                   alert("请至少选择一项!");
                   return false;
               }
               if(confirm("确定删除所选项目?")){
               var checkedList = "";
               $("input[name='subcheck']:checked").each(function(){
                   checkedList+=$(this).val()+",";
               });
               $.ajax({
                   type:"POST",
                   url:"batchDelStudent",
                   data:{"delItems":checkedList},
                   datatype:"html",
                   success:function(data){
                       $("[name='checkbox2']:checkbox").attr("checked",false);
                       location.reload();//页面刷新
                   },
                   error:function(data){
                       art.dialog.tips('删除失败!');
                   }
               });
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
				<th><button onclick="batchDeletes()">批量删除</button></th>
				<th>班级编号</th>
				<th>班级名称</th>
				<th>班级简介</th>
				<th>编辑</th>
	            <th>删除</th>
			</tr>
		</thead>
		<c:forEach items="${sc}" var="s">
			<tr>
				<td><input type="checkbox" id="subcheck" 
					name="subcheck" value="${s.class_id }"/> </td>
				<td><c:out value="${s.class_id }"></c:out> </td>
				<td><c:out value="${s.class_name }"></c:out> </td>
				<td><c:out value="${s.class_introduce }"></c:out> </td>
				
				<td><a href="editStuClass?class_id=${s.class_id}">编辑</a></td>
	            <td><a href="deleteStuClass?class_id=${s.class_id}">删除</a></td>
			</tr>

		</c:forEach>
	</table>
		<div style="text-align:center">
					<a href="showAllStuClass?start=0">首   页</a>					
					<a href="showAllStuClass?start=${page.start-page.count}">上一页</a>
					<a href="showAllStuClass?start=${page.start+page.count}">下一页</a>
					<a href="showAllStuClass?start=${page.last}">尾   页</a>				
		</div>
</body>
</html>
