package com.company.vo;

public class ResultVO<T>
{
  private int state = 1;

  private String message = "²Ù×÷³É¹¦";
  private T data;

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

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }
}