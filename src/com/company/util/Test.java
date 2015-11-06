package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test
{
  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String URL = "jdbc:mysql:///mybatis";
  private static final String USER = "root";
  private static final String PWD = "kerui";

  public static void main(String[] args)
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql:///mybatis", "root", "kerui");
      Statement stmt = conn.createStatement();
      stmt.executeUpdate("insert into user(username) value('¿œ∏ ')");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}