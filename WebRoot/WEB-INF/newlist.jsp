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

function getallimg() {  
    $.ajax( {  
        type : "get",  
        url : "getallimg.do",  
        dataType:"json",  
        success : function(article) {
           	console.log(article);
        	var oTest1,newNode1="";
    		oTest1 = document.getElementById("img"); 
    		oTest1.innerHTML="";
    		//oTest1.innerHTML="";
     
	for( var i=0;i<article.user.length;i++){
	  /* 	newNode1 = document.createElement("li");  */
    		
    		newNode1+="<div class='bloglist left'><p>"+article.user[i].img_date+"</p><img src='http://bloggr-xxx.stor.sinaapp.com/"+article.user[i].img_url+"'><img/></div>";
    	
    	/* 	newNode1.innerHTML =""; */

   
    		// alert("Data Saved: " + article.user[i].article_title+"--"+article.user[i].article_content);  
	}
  	oTest1.innerHTML =  newNode1;
 
        }  
    });  
}  
window.onload = function() { 
	getallimg();  
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
 
  <nav class="topnav" id="topnav"><a href="index.do"><span>首页</span><span class="en">Protal</span></a><a href="about.do"><span>关于我</span><span class="en">About</span></a><a href="newlist.do"><span>慢生活</span><span class="en">Life</span></a><a href="knowledge.do"><span>学无止境</span><span class="en">Learn</span></a><a href="book.do"><span>留言版</span><span class="en">Gustbook</span></a></nav>
  </nav>
</header>
<article class="blogs">
<h1 class="t_nav"><span>“慢生活”不是懒惰，放慢速度不是拖延时间，而是让我们在生活中寻找到平衡。</span></h1>
<div class="newblog left">

  <h2>P h o t o</h2>
    <div class="line"></div>
    <div class="blank"></div>
    <div class="ad">  
   
    </div>
   <div id="img"></div>
</div>
<aside class="right">
 
<div class="news">
<h3>

 
    </div>
   

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
<script src="js/silder.js"></script>
</body>
</html>