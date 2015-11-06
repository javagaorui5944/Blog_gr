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
  <nav class="topnav" id="topnav"><a href="index.do"><span>首页</span><span class="en">Protal</span></a><a href="about.do"><span>关于我</span><span class="en">About</span></a><a href="newlist.do"><span>慢生活</span><span class="en">Life</span></a><a href="knowledge.do"><span>学无止境</span><span class="en">Learn</span></a><a href="#"><span>留言版</span><span class="en">Gustbook</span></a></nav>
  </nav>
</header>
<article class="aboutcon">
<h1 class="t_nav"><span>留言板。</span><a href="/" class="n1"></a></h1>

  <!-- 多说评论框 start -->
	<div class="ds-thread" data-thread-key="0" data-title="0" data-url="0"></div>
<!-- 多说评论框 end -->
<!-- 多说公共JS代码 start (一个网页只需插入一次) -->
<script type="text/javascript">
var duoshuoQuery = {short_name:"bloggr"};
	(function() {
		var ds = document.createElement('script');
		ds.type = 'text/javascript';ds.async = true;
		ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
		ds.charset = 'UTF-8';
		(document.getElementsByTagName('head')[0] 
		 || document.getElementsByTagName('body')[0]).appendChild(ds);
	})();
	</script>
<!-- 多说公共JS代码 end -->

 
</article>
<footer>
  <p>Design by DanceSmile <a href="#" title="源码之家" target="_blank">JavaGR——ais的小站</a> <a href="/">网站统计</a></p>
</footer>
<script src="../blog/js/silder.js"></script>
  </body>
</html>
