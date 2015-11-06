package com.gaorui.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class  Jdbc
{
  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String URL = "jdbc:mysql:///mybatis?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true";
  private static final String USER = "root";
  private static final String PWD = "yeyuan0110";
  PreparedStatement pstm=null;
	ResultSet rs=null;
	Connection conn=null;
 public ArrayList<UserBean> getUser(){
	
			ArrayList<UserBean> al = new ArrayList<UserBean>();
    try
    {
    	 Class.forName(DRIVER);
         conn = DriverManager.getConnection(URL, USER, PWD);
         pstm =conn.prepareStatement("select * from user");
         rs=pstm.executeQuery();
     
         while(rs.next()){
        	UserBean ub = new UserBean();
        	ub.setId(rs.getInt("id"));
        	ub.setCompany(rs.getString("company"));
        	ub.setDepartment(rs.getString("department"));
        	ub.setName(rs.getString("name"));
        	ub.setSex(rs.getString("sex"));
        	ub.setId_card(rs.getString("id_card"));
        	ub.setWage_card(rs.getString("wage_card"));
        	ub.setWork_stime(rs.getDate("work_stime"));
        	ub.setWork_ftime(rs.getDate("work_ftime"));
        	ub.setParty(rs.getString("party"));
        	ub.setJoin_ptime(rs.getDate("join_ptime"));
        	ub.setParty_money(rs.getDouble("party_money"));
        	ub.setLtx_duties(rs.getString("ltx_duties"));
        	ub.setGonggai_type(rs.getString("gonggai_type"));
        	ub.setGroup_number(rs.getDouble("group_number"));
        	ub.setGroup_leader(rs.getString("group_leader"));
        	ub.setParty_number(rs.getDouble("party_number"));
        	ub.setPaty_leader(rs.getString("paty_leader"));
        	ub.setAge(rs.getDouble("age"));
        	ub.setWork_age(rs.getDouble("work_age"));
        	ub.setLtx_scale(rs.getDouble("ltx_scale"));
        	ub.setRaise_scale(rs.getDouble("raise_scale"));
        	ub.setCost_time(rs.getDate("cost_time"));
        	ub.setLtx_treatment(rs.getString("ltx_treatment"));
        	ub.setBaes_cost(rs.getDouble("baes_cost"));
        	ub.setChange_cost(rs.getDouble("change_cost"));
        	ub.setBl_subsidy(rs.getDouble("bl_subsidy"));
            ub.setLaol_subsidy(rs.getDouble("laol_subsidy"));
            ub.setTs_subsidy(rs.getDouble("ts_subsidy"));
            ub.setOther_subsidy(rs.getDouble("other_subsidy"));
            ub.setNurse_cost(rs.getDouble("nurse_cost"));
            ub.setWageCard_money(rs.getDouble("wageCard_money"));
        	   
        	al.add(ub);
        	
         }
      
    } catch (Exception e) {
    	e.printStackTrace();
    }
	return al;
 
  }
}