package com.company.action;

import java.io.File;
import java.util.Date;
import javax.servlet.ServletContext;
import org.apache.commons.fileupload.FileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadAction
  implements ServletContextAware
{
  private ServletContext servletContext;

  @RequestMapping({"upload"})
  public String upload()
  {
    return "upload";
  }

  public void setServletContext(ServletContext context)
  {
    this.servletContext = context;
  }

  @RequestMapping(value={"/uploadData"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public String handleUploadData(String name, @RequestParam("file") CommonsMultipartFile file)
  {
    if (!file.isEmpty()) {
      String path = this.servletContext.getRealPath("/upload/");
      String fileName = file.getOriginalFilename();
      String fileType = fileName.substring(fileName.lastIndexOf("."));
      File file2 = new File(path, new Date().getTime() + fileType);
      try {
        file.getFileItem().write(file2);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return "redirect:upload_ok.jsp";
    }
    return "redirect:upload_error.jsp";
  }
}