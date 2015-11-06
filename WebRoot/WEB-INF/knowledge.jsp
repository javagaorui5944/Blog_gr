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

<script type="text/javascript" src="../js/jquery-1.7.2.js">
</script>
<script type="text/javascript">  








/* $(function() {  
    getjson();  
});   */

function getallknowledge() {  
    $.ajax( {  
        type : "get",  
        url : "getallknowledge.do",  
        dataType:"json",  
        success : function(article) {
        	var oTest1,newNode1="";
    		oTest1 = document.getElementById("knowledge"); 
    		oTest1.innerHTML="";
    		//oTest1.innerHTML="";
        	console.log(article);
	for( var i=0;i<article.user.length;i++){
	  /* 	newNode1 = document.createElement("li");  */
    		
    		newNode1+="<div class='bloglist left' > <h3>"+ article.user[i].knowledge_title+"</h3><p>"+article.user[i].knowledge_date+"</p>  <a title=''/' href='readmore.do?id="+article.user[i].knowledge_id+"' target='_blank' class='readmore'>详细信息>></a></div>";
    	
    	/* 	newNode1.innerHTML =""; */

   
    		// alert("Data Saved: " + article.user[i].article_title+"--"+article.user[i].article_content);  
	}
  	oTest1.innerHTML =  newNode1;
        }
       
    });  

}

window.onload = function() { 
	getallknowledge();  
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
 
  <nav class="topnav" id="topnav"><a href="http://localhost:8080/Blog_gr"><span>首页</span><span class="en">Protal</span></a><a href="about.do"><span>关于我</span><span class="en">About</span></a><a href="newlist.do"><span>慢生活</span><span class="en">Life</span></a><a href="#"><span>学无止境</span><span class="en">Learn</span></a><a href="book.do"><span>留言版</span><span class="en">Gustbook</span></a></nav>
  </nav>
</header>
<article class="blogs">
<h1 class="t_nav"><span>长路漫漫，只因学无止境。 </span></h1>
<div class="newblog left" id="knowledge">
  
  <!--  <p class="dateview"><span>发布时间：2013-11-04</span><span>作者：杨青</span><span>分类：[<a href="/news/life/">个人博客模板</a>]</span></p>
    <figure><img src="images/01.jpg"></figure>
    <ul class="nlist">
      <p>界面设计非原创，出自新浪博客风格・梅作者水云心。在原来的设计上增加了梅花飘落的flash动画。原设计的边界阴影部分用图片实现，本例采用css3新的规则属性，box-shadow</p>
      <a title="/" href="/" target="_blank" class="readmore">详细信息>></a>
    </ul>
    <div class="line"></div>
     <h2>黑色质感时间轴html5个人博客模板</h2>
   <p class="dateview"><span>发布时间：2013-11-04</span><span>作者：杨青</span><span>分类：[<a href="/news/life/">个人博客模板</a>]</span></p>
    <figure><img src="images/02.jpg"></figure>
    <ul class="nlist">
      <p>黑色时间轴html5个人博客模板颜色以黑色为主色，添加了彩色作为网页的一个亮点，导航高亮显示、banner图片鼠标划过，可以看到隐藏的文字。css3动画应用在banner和右边“我的名片”个人信息。重点在时间轴部分，三角形和圆形均是css代码写出来的，postion定位，增加页面返回到顶部的代码....</p>
      <a title="/" href="/" target="_blank" class="readmore">详细信息>></a>
    </ul>
    <div class="line"></div>
         <h2>Green绿色小清新的夏天-个人博客模板</h2>
   <p class="dateview"><span>发布时间：2013-11-04</span><span>作者：杨青</span><span>分类：[<a href="/news/life/">个人博客模板</a>]</span></p>
    <figure><img src="images/03.jpg"></figure>
    <ul class="nlist">
      <p>这是一个有关Green绿色小清新的夏天的css3 html5绿色个人博客网站模板，导航下面的效果使用了CSS3 Animation 实现对象从右到左渐变的动画效果。</p>
      <a title="/" href="/" target="_blank" class="readmore">详细信息>></a>
    </ul>
    <div class="line"></div>
         <h2>女生清新个人博客网站模板</h2>
   <p class="dateview"><span>发布时间：2013-11-04</span><span>作者：杨青</span><span>分类：[<a href="/news/life/">个人博客模板</a>]</span></p>
    <figure><img src="images/04.jpg"></figure>
    <ul class="nlist">
      <p>这是一个html5+css个人博客模板，顶部导航用了css3的gradient背景颜色渐变效果，结合js，对当前栏目高亮显示并且skew水平倾斜的效果。左侧头像也用了css3鼠标放上去滑动出文字的效果...</p>
      <a title="/" href="/" target="_blank" class="readmore">详细信息>></a>
    </ul>
    <div class="line"></div>
    <div class="blank"></div>
    <div class="ad">  
    <img src="images/ad.png"> -->
    </div>
    
</div>
<aside class="right">

     <!-- Baidu Button BEGIN -->
    <div id="bdshare" class="bdshare_t bds_tools_32 get-codes-bdshare"><a class="bds_tsina"></a><a class="bds_qzone"></a><a class="bds_tqq"></a><a class="bds_renren"></a><span class="bds_more"></span><a class="shareCount"></a></div>
    <script type="text/javascript" id="bdshare_js" data="type=tools&amp;uid=6574585" ></script> 
    <script type="text/javascript" id="bdshell_js"></script> 
    <script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000)
</script> 
    <!-- Baidu Button END -->   
</aside>
</article>
<footer>
  <p>Design by DanceSmile <a href="#" title="源码之家" target="_blank">JavaGR_ais的小站</a> <a href="/">网站统计</a></p>
</footer>
<!-- <script src="js/silder.js"></script> -->
</body>
</html>