package com.company.entity;

public class Fields
{
  private int id;
  private String display;
  private String name;
  private String type;

  public String getType()
  {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDisplay() {
    return this.display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}