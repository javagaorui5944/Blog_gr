package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction
{
  @RequestMapping({"login"})
  public String login()
  {
    return "login";
  }
  @RequestMapping({"index"})
  public String index() {
    return "index";
  }
}