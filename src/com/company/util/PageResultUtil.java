package com.company.util;

import java.util.List;

public class PageResultUtil
{
  private long total;
  private int pageSize = 10;
  private int currentPage = 1;
  private int pageCount;
  private List<?> rows;

  public PageResultUtil()
  {
    this.pageSize = 10;
    this.currentPage = 1;
  }

  public PageResultUtil(int currentPage, int pageSize) {
    this.currentPage = currentPage;
    this.pageSize = pageSize;
  }

  public long getTotal() {
    return this.total;
  }

  public void setTotal(long total) {
    this.total = total;
    if ((this.total > 0L) && (this.pageSize > 0))
      this.pageCount = (int)Math.ceil(this.total / this.pageSize);
  }

  public int getPageSize()
  {
    return this.pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
    if ((this.total > 0L) && (this.pageSize > 0))
      this.pageCount = (int)Math.ceil(this.total / this.pageSize);
  }

  public int getCurrentPage()
  {
    return this.currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPageCount() {
    return this.pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public List<?> getRows() {
    return this.rows;
  }

  public void setRows(List<?> rows) {
    this.rows = rows;
  }
}