package com.ivoronline.springboot_db_transaction_h2.service;

import com.ivoronline.springboot_db_transaction_h2.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.sql.SQLException;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private MyRepository repository;
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public void insert() throws Exception {

    //INSERT RECORDS
    for (int i = 1; i <= 2; i++) {
      if(i==2) { throw new Exception("Exception"); }
      repository.insert("Person " + i, 10 * i);
    }

  }

}
