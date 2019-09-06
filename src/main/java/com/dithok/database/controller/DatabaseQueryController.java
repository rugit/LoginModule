//Database part
package com.dithok.database.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;  


	//Database handling Part


@RestController  
public class DatabaseQueryController {  
  @Autowired  
  JdbcTemplate jdbc;    
  @RequestMapping("/insert")  
  public String index(){  
      jdbc.execute("insert into user(name,email)values(user.getUserName(),user.getEmailID()");  
      return"data inserted Successfully";  
  }  
}  
