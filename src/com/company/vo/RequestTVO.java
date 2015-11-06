package com.company.vo;

import java.util.List;

public class RequestTVO<T>
{
  private int state;
  private String message;
  private List<T> data;

  public int getState()
  {
    return this.state;
  }
  public void setState(int state) {
    this.state = state;
  }

  public String getMessage() {
    return this.message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public List<T> getData() {
    return this.data;
  }
  public void setData(List<T> data) {
    this.data = data;
  }
}