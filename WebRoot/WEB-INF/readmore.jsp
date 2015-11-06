<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 
 <head>
<meta charset="UTF-8">
<title>个人博客（寻梦）</title>
<meta name="keywords" content="个人博客,杨青个人博客,个人博客模板,杨青" />
<meta name="description" content="杨青个人博客，是一个站在web前端设计之路的女程序员个人网站，提供个人博客模板免费资源下载的个人原创网站。" />

<link href="../blog/css/base.css" rel="stylesheet">
<link href="../blog/css/index.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->

</head>
<body>
<header>
  <div id=""><a href="/"></a></div>
  </nav>
</header>
<article class="aboutcon">
<h1 class="t_nav"><span>全文阅读</span><a href="#" class="n1"></a></h1>


  
<div class='bloglist left' > 
<code>

${user}

</code>
 </div>


</article>




<footer>
  <p>Design by DanceSmile <a href="#" title="源码之家" target="_blank">JavaGR——ais的小站</a> <a href="/">网站统计</a></p>
</footer>
<script src="../blog/js/silder.js"></script>
  </body>
</html>
