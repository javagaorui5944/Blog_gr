package com.gaorui.JDBC;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Jdbc jdbc = new Jdbc();
		ArrayList<UserBean> al=	jdbc.getUser();
		for(int i=0;i<al.size();i++)	{
			UserBean ub = al.get(i);
		
			Map m = new HashMap();
			m.put("id", ub.getId());
			m.put("company", ub.getCompany());
			m.put("name", ub.getName());
			System.out.println("¸ßÈð²âÊÔ"+ ub.getName()+ ub.getCompany()+ ub.getId());
			SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
			Date d = (Date) sdf.parse("2012-05-9");
			System.out.println(d);
			}

	}

}
