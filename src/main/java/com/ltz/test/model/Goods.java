package com.ltz.test.model;

import java.io.Serializable;

/**
 * goods_0
 * @author 
 */
public class Goods implements Serializable {
    private Integer id;

    private Integer userId;

    private String name;
    private Integer age;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}