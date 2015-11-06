package com.company.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;

public class ActionSupportUtil
{
  protected HttpServletRequest request;
  protected HttpServletResponse response;
  protected HttpSession session;

  @ModelAttribute
  public void setReqAndRes(HttpServletRequest request, HttpServletResponse response)
  {
    this.request = request;
    this.response = response;
    this.session = request.getSession();
  }

  protected void responseJson(HttpServletResponse response, List<?> data) throws IOException
  {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();

    out.flush();
    out.close();
  }

  protected void successJson(HttpServletResponse response, List<?> data) throws IOException {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    out.flush();
    out.close();
  }

  protected void successJson(HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    out.flush();
    out.close();
  }

  protected void errorJson(HttpServletResponse response)
    throws IOException
  {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    out.flush();
    out.close();
  }

  protected void errorJson(HttpServletResponse response, String message) throws IOException {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    out.flush();
    out.close();
  }

  protected void errorJson(HttpServletResponse response, String message, Object data) throws IOException {
    response.setContentType("text/html;charset=utf-8");
    response.setCharacterEncoding("utf-8");
    PrintWriter out = response.getWriter();
    out.flush();
    out.close();
  }
}