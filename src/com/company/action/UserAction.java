package com.company.action;

import com.company.entity.Fields;
import com.company.service.UserService;
import com.company.vo.ResultVO;
import com.gaorui.JDBC.Jdbc;
import com.gaorui.JDBC.UserBean;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping({ "User" })
public class UserAction {

	@Resource
	private UserService userService;
	private static Map<String, Object> condition = null;

	private static String cont = "";

@RequestMapping({ "getAllUser" })
@ResponseBody
		public  Map<String , Object> getAllUser(){
			List<Map<String , Object>> users = userService.getAllUser();
			Map<String , Object> map = new HashMap<String , Object>();
	
			map.put("user",users);
			return map;	
	}

@RequestMapping({ "readmore" })
		public String readmore(HttpServletRequest request){
		String id = request.getParameter("id");
		int id1 = Integer.parseInt(id);
		String content =  userService.readmore(id1);
		System.out.println(content);
			/*Map map = new HashMap<>();
			map.put("user", user);*/
			request.setAttribute("user", content);
			return "readmore" ;	
	}




@RequestMapping("/uploadfile2")
public String uploadfile2(HttpServletRequest request){
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  Date d =new Date();
	  String date1 =format.format(d);
	  String filename = null;
	// //创建一个通用的多部分解析器 
	CommonsMultipartResolver cmr =new CommonsMultipartResolver(request.getSession().getServletContext());
	// //判断 request 是否有文件上传,即多部分请求  
	if(cmr.isMultipart(request)){
		//转换成多部分request    
		MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request;
		// //取得request中的所有文件名  
		Iterator<String> iter = mhsr.getFileNames();
		while(iter.hasNext()){
			////取得上传文件  
			MultipartFile file = mhsr.getFile((String)iter.next());
		//	MultipartFile file1 = mhsr.getFile((String)iter.next());
			// //取得当前上传文件的文件名称  
			 filename = file.getOriginalFilename();
			 //定义上传路径  
			String path = "http://bloggr-xxx.stor.sinaapp.com/"+filename;
			//String path2 ="F:\\myeclipse项目\\Blog_gr\\WebRoot\\blog\\images\\"+filename;
			//String path =request.getServletContext().getRealPath("/")+"blog/"+"images/"+filename;
			 File file2 = new File(path);
			 
		//	File file3 = new File(path2);
			try {
			
					//transfer方法是MultipartFile包中提供的方法，直接可以写入文件到指定目录
				//file.transferTo(file2);
				//file1.transferTo(file3);
				
			} catch (IllegalStateException e) {
				
				e.printStackTrace();
			} /*catch (IOException e) {
				
				e.printStackTrace();
			}*/
		}
	}
	userService.insertimg(filename,date1 );
	return "newlist";
}

@RequestMapping({ "getallimg" })
@ResponseBody
		public  Map<String , Object> getallimg(){
			List<Map<String , Object>> users = userService.getallimg();
			Map<String , Object> map = new HashMap<String , Object>();
			map.put("user",users);
			return map;	
	}



@RequestMapping({ "getallknowledge" })
@ResponseBody
		public  Map<String , Object> getallknowledge(){
			List<Map<String , Object>> users = userService.getallknowledge();
			Map<String , Object> map = new HashMap<String , Object>();
			map.put("user",users);
			return map;
	}

@RequestMapping({ "getallarticle" })
@ResponseBody
		public  Map<String , Object> getallarticle(){
			List<Map<String , Object>> users = userService.getallarticle();
			Map<String , Object> map = new HashMap<String , Object>();
	
			map.put("user",users);
			return map;	
	}
@RequestMapping({"article"})
public String article(HttpServletRequest request) throws UnsupportedEncodingException{
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String title1 =new String(title.getBytes("ISO-8859-1"),"utf-8");
	String content1 =new String(content.getBytes("ISO-8859-1"),"utf-8");
	System.out.println(title+content1+"GRceshi");
	String filename = null;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  Date d =new Date();
	  String date1 =format.format(d);
	  
		CommonsMultipartResolver cmr =new CommonsMultipartResolver(request.getSession().getServletContext());
		// //判断 request 是否有文件上传,即多部分请求  
		if(cmr.isMultipart(request)){
			//转换成多部分request    
			MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request;
			// //取得request中的所有文件名  
			Iterator<String> iter = mhsr.getFileNames();
			while(iter.hasNext()){
				////取得上传文件  
				MultipartFile file = mhsr.getFile((String)iter.next());
				// //取得当前上传文件的文件名称  
				 filename = file.getOriginalFilename();
				 //定义上传路径  
				String path = "http://bloggr.sinaapp.com/blog/images/"+filename;
				//String path =request.getServletContext().getRealPath("/")+"blog/"+"images/"+filename;
				File file2 = new File(path);
				try {
				
					//transfer方法是MultipartFile包中提供的方法，直接可以写入文件到指定目录
				//	file.transferTo(file2);
					
				} catch (IllegalStateException e) {
					
					e.printStackTrace();
				} /*catch (IOException e) {
					
					e.printStackTrace();
				}*/
			}	
}
		userService.article(title, content,date1,filename);
		return "index1";
}



@RequestMapping({"knowledgecl"})
public String knowledge(HttpServletRequest request) throws UnsupportedEncodingException{
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	Matcher ma = Pattern.compile("<\\s*IMG\\s+([^>]+)\\s*>").matcher(content);
	System.out.println(ma.toString()+"ma");
	String con1 = content.replaceAll("&lt;img", "<img").replaceAll("&lt;/img&gt;", "</img>").replaceAll("jpg&gt;", "jpg>");


	String title1 =new String(title.getBytes("ISO-8859-1"),"utf-8");
	String content1 =new String(content.getBytes("ISO-8859-1"),"utf-8");
	System.out.println(title+content1+"GRceshi");
	String filename = null;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  Date d =new Date();
	  String date1 =format.format(d);
	  
		CommonsMultipartResolver cmr =new CommonsMultipartResolver(request.getSession().getServletContext());
		// //判断 request 是否有文件上传,即多部分请求  
		if(cmr.isMultipart(request)){
			//转换成多部分request    
			MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request;
			// //取得request中的所有文件名  
			Iterator<String> iter = mhsr.getFileNames();
			while(iter.hasNext()){
				////取得上传文件  
				MultipartFile file = mhsr.getFile((String)iter.next());
				// //取得当前上传文件的文件名称  
				 filename = file.getOriginalFilename();
				 //定义上传路径  
					String path = "http://bloggr.sinaapp.com/blog/images/"+filename;
				//String path =request.getServletContext().getRealPath("/")+"blog/"+"images/"+filename;
				File file2 = new File(path);
				try {
				
					//transfer方法是MultipartFile包中提供的方法，直接可以写入文件到指定目录
					file.transferTo(file2);
					
				} catch (IllegalStateException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}	
}
		userService.knowledge(title, con1,date1);
		return "knowledge";
}
/**
 * 前台导航跳转
 * @
 */
@RequestMapping({"about"})
		public String Ueditor(){
			return "about";
}
@RequestMapping({"newlist"})
	public String newlist(){
	return "newlist";
}
@RequestMapping({"moodlist"})
	public String moodlist(){
	return "moodlist";
}
@RequestMapping({"share"})
	public String share(){
	return "share";
}
@RequestMapping({"knowledge"})
	public String knowledge(){
	return "knowledge";
}
@RequestMapping({"book"})
	public String book(){
	return "book";
}
@RequestMapping({"index"})
public String index(){
return "index1";
}


}