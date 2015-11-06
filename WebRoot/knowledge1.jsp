<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <title>完整demo</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
 <script type="text/javascript" charset="utf-8" src="ueditor1_4_3-utf8-jsp/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="ueditor1_4_3-utf8-jsp/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="ueditor1_4_3-utf8-jsp/lang/zh-cn/zh-cn.js"></script>
  
    <style type="text/css">
        div{
            width:100%;
        }
    </style>
</head>

<body>
<div>
	
</div>

<div id="btns">
	<form action="User/knowledgecl.do" method="post" enctype="multipart/form-data">
	Title
	<input type="text" id="title" name="title">
		<input type="file" name="file" >
			<input type="file" name="file1" >
				<input type="file" name="file2" >
					<input type="file" name="file3" >
						<input type="file" name="file4" >
							<input type="file" name="file5" >
								<input type="file" name="file6" >
	<div>
 
   <script id="editor" type="text/plain" style="width:500px;height:200px;" name="content"></script> 
   
</div>
		<input type="submit" value="submit">
	</form>

    
  
</div>


<script type="text/javascript">

    //实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
    var ue = UE.getEditor('editor');


  
    /* function getContent() {
    	var title = document.getElementById("title").value;
        var arr = [];
        arr.push("使用editor.getContent()方法可以获得编辑器的内容");
        arr.push("内容为：");
        arr.push(UE.getEditor('editor').getContent());
        alert(arr.join("\n"));
        var form = document.forms[0];
		form.action="User/article.do?content="+UE.getEditor('editor').getContent();
		form.method="post";
		form.submit();
    } */
   
</script>
</html>
