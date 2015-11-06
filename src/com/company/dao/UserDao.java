package com.company.dao;

import com.company.entity.Fields;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

public abstract interface UserDao
{
  public abstract List<Map<String , Object>> getAllUser();
  public abstract void knowledge(@Param("title") String title,@Param("content") String content,@Param("date") String date );

  public abstract void article(@Param("title") String title,@Param("content") String content,@Param("date") String date,@Param("article_img") String article_img );
  public abstract List<Map<String , Object>> getallarticle();
  public abstract  List<Map<String , Object>> getallimg();
  public abstract void insertimg(@Param("img_url") String img_url,@Param("img_date") String img_date);
  public abstract List<Map<String, Object>> getallknowledge();
  public abstract String readmore(@Param("id") int id);
}