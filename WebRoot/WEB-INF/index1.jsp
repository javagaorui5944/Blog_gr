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

<meta name="keywords" content="个人博客模板,博客模板" />
<meta name="description" content="寻梦主题的个人博客模板，优雅、稳重、大气,低调。" />
<script type="text/javascript" src="../js/jquery-1.7.2.js">
</script>
<script type="text/javascript">  
/* $(function() {  
    getjson();  
});   */

function getAllaricle() {  
    $.ajax( {  
        type : "get",  
        url : "getallarticle.do",  
        dataType:"json",  
        success : function(article) {
        	var oTest1,newNode1="";
    		oTest1 = document.getElementById("article"); 
    		oTest1.innerHTML="";
    		//oTest1.innerHTML="";
        	console.log(article);
	for( var i=0;i<article.user.length;i++){
	  /* 	newNode1 = document.createElement("li");  */
    		
    		newNode1+="<div class='bloglist left' > <h3>"+ article.user[i].article_title+"</h3><figure><img src='http://bloggr-xxx.stor.sinaapp.com/"+article.user[i].article_img+"'></figure><ul><p>"+article.user[i].article_content+"</p><p>"+article.user[i].article_date+"</p></ul> </div>";
    	
    	/* 	newNode1.innerHTML =""; */

   
    		// alert("Data Saved: " + article.user[i].article_title+"--"+article.user[i].article_content);  
	}
  	oTest1.innerHTML =  newNode1
 
        }  
    });  
}  
window.onload = function() { 
	getAllaricle();  
};
</script>

<link href="../blog/css/base.css" rel="stylesheet">
<link href="../blog/css/index.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]--> 
</head>
<body>
<header>
 
  <nav class="topnav" id="topnav"><a href="#"><span>首页</span><span class="en">Protal</span></a><a href="about.do"><span>关于我</span><span class="en">About</span></a><a href="newlist.do"><span>慢生活</span><span class="en">Life</span></a><a href="knowledge.do"><span>学无止境</span><span class="en">Learn</span></a><a href="book.do"><span>留言版</span><span class="en">Gustbook</span></a></nav>
  </nav>
</header>
<div class="banner">
  <section class="box">
    <ul class="texts">
      <p>你就像我web程序中的404。</p>
      <p>永远，永远</p>
      <p>也找不到你在我的哪个位置</p>
    </ul>
    <div class="avatar"><a href="#"><span>高瑞</span></a> </div>
  </section>
</div>

<!-- <div class="template">
  <div class="box">
    <h3>
      <p><span>个人博客</span>模板 Templates</p>
    </h3>
    <ul>
      <li><a href="/"  target="_blank"><img src="images/01.jpg"></a><span>仿新浪博客风格・梅――古典个人博客模板</span></li>
      <li><a href="/" target="_blank"><img src="images/02.jpg"></a><span>黑色质感时间轴html5个人博客模板</span></li>
      <li><a href="/"  target="_blank"><img src="images/03.jpg"></a><span>Green绿色小清新的夏天-个人博客模板</span></li>
      <li><a href="/" target="_blank"><img src="images/04.jpg"></a><span>女生清新个人博客网站模板</span></li>
      <li><a href="/"  target="_blank"><img src="images/02.jpg"></a><span>黑色质感时间轴html5个人博客模板</span></li>
      <li><a href="/"  target="_blank"><img src="images/03.jpg"></a><span>Green绿色小清新的夏天-个人博客模板</span></li>
    </ul>
  </div>
</div> -->
<article>
  <aside class="left">
  <h2 class="title_tj">
    <p>微文<span>分享</span></p>
  </h2>
  <div  id="article">

  <!-- <div class="bloglist left" >
    <h3>程序员请放下你的技术情节，与你的同伴一起进步</h3>
    <figure><img src="../blog/images/001.png"></figure>
    <ul>
      <p>如果说掌握一门赖以生计的技术是技术人员要学会的第一课的话， 那么我觉得技术人员要真正学会的第二课，不是技术，而是业务、交流与协作，学会关心其他工作伙伴的工作情况和进展...</p>
      <a title="/" href="/" target="_blank" class="readmore">阅读全文>></a>
    </ul>
   
  </div> -->

  </div>
    </aside>
  <aside class="right">
    <div class="weather"><iframe width="250" scrolling="no" height="60" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=12&icon=1&num=1"></iframe></div>

<!-- Baidu Button BEGIN -->
    <div id="bdshare" class="bdshare_t bds_tools_32 get-codes-bdshare"><a class="bds_tsina"></a><a class="bds_qzone"></a><a class="bds_tqq"></a><a class="bds_renren"></a><span class="bds_more"></span><a class="shareCount"></a></div>
    <script type="text/javascript" id="bdshare_js" data="type=tools&amp;uid=6574585" ></script> 
    <script type="text/javascript" id="bdshell_js"></script> 
    <script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000)
</script> 
    <!-- Baidu Button END -->   
    <a href="/" class="weixin"> </a></aside>
</article>
<!--     <h3>
      <p>最新<span>文章</span></p>
    </h3> -->
  <!--   <ul class="rank">
      <li><a href="/" title="Column 三栏布局 个人网站模板" target="_blank">Column 三栏布局 个人网站模板</a></li>
      <li><a href="/" title="with love for you 个人网站模板" target="_blank">with love for you 个人网站模板</a></li>
      <li><a href="/" title="免费收录网站搜索引擎登录口大全" target="_blank">免费收录网站搜索引擎登录口大全</a></li>
      <li><a href="/" title="做网站到底需要什么?" target="_blank">做网站到底需要什么?</a></li>
      <li><a href="/" title="企业做网站具体流程步骤" target="_blank">企业做网站具体流程步骤</a></li>
      <li><a href="/" title="建站流程篇――教你如何快速学会做网站" target="_blank">建站流程篇――教你如何快速学会做网站</a></li>
      <li><a href="/" title="box-shadow 阴影右下脚折边效果" target="_blank">box-shadow 阴影右下脚折边效果</a></li>
      <li><a href="/" title="打雷时室内、户外应该需要注意什么" target="_blank">打雷时室内、户外应该需要注意什么</a></li>
    </ul>
    <h3 class="ph">
      <p>点击<span>排行</span></p>
    </h3>
    <ul class="paih">
      <li><a href="/" title="Column 三栏布局 个人网站模板" target="_blank">Column 三栏布局 个人网站模板</a></li>
      <li><a href="/" title="withlove for you 个人网站模板" target="_blank">with love for you 个人网站模板</a></li>
      <li><a href="/" title="免费收录网站搜索引擎登录口大全" target="_blank">免费收录网站搜索引擎登录口大全</a></li>
      <li><a href="/" title="做网站到底需要什么?" target="_blank">做网站到底需要什么?</a></li>
      <li><a href="/" title="企业做网站具体流程步骤" target="_blank">企业做网站具体流程步骤</a></li>
    </ul> -->
   <!--  <h3 class="links">
      <p>友情<span>链接</span></p>
    </h3>
    <ul class="website">
      <li><a href="/">个人博客</a></li>
      <li><a href="/">谢泽文个人博客</a></li>
      <li><a href="/">3DST技术网</a></li>
      <li><a href="/">思衡网络</a></li>
    </ul>  -->
   
    
<footer>
  <p>Design by DanceSmile <a href="#" title="源码之家" target="_blank">JavaGR——ais的小站</a> <a href="/">网站统计</a></p>
</footer>
<script src="blog/js/silder.js"></script>
  </body>
</html>
