<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="commons/bootstrap/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="commons/bootstrap/css/bootstrap-theme.min.css">

<script type="text/javascript" src="commons/jquery/jquery.js"></script>
<script type="text/javascript" src="commons/bootstrap/js/bootstrap.min.js"></script>

<title>新主页</title>
</head>
<body>
<h2>Welcome~<%=request.getParameter("username") %></h2>
<nav class="navbar navbar-default" role="navigation">
   <div class="navbar-header">
      <a class="navbar-brand" href="javascript:void(0)">朱云鹤的博客</a>
   </div>
   <div>
      <ul class="nav navbar-nav">
         <li class="active"><a href="javascript:void(0)">文章</a></li>
         <li><a href="javascript:void(0)">照片</a></li>
         <li class="dropdown">
            <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown">
                                              兴趣爱好 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="javascript:void(0)">音乐</a></li>
               <li class="divider"></li>
               <!-- <li class="divider"></li> -->
               <li><a href="javascript:void(0)">历史</a></li>
            </ul>
         </li>
         <li><a href="modules/photo/photo.jsp">德国游记</a></li>
      </ul>
   </div>
</nav>
</body>
</html>