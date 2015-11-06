package com.company.service.imp;

import com.company.dao.UserDao;
import com.company.entity.Fields;
import com.company.service.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public List<Map<String , Object>> getAllUser() {
		// TODO Auto-generated method stub
		List<Map<String , Object>> user = userDao.getAllUser();
		
		return user;
	}

	@Override
	public void article(String title, String content ,String date,String article_img) {
		userDao.article(title, content,date,article_img);
		
	}

	@Override
	public List<Map<String, Object>> getallarticle() {
		
		return userDao.getallarticle();
	}

	@Override
	public List<Map<String, Object>> getallimg() {
		
		return userDao.getallimg();
	}

	@Override
	public void insertimg( String img_url, String img_date) {
		userDao.insertimg(img_url, img_date);
		
	}

	@Override
	public void knowledge( String title,String content,  String date) {
		userDao.knowledge(title, content, date);
	}

	@Override
	public List<Map<String, Object>> getallknowledge() {

		return userDao.getallknowledge();
	}

	@Override
	public String readmore( int id) {

		return userDao.readmore(id) ;
	}
	


	
	
}