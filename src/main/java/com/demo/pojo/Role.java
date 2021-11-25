package com.demo.pojo;

import lombok.Data;

/**
 * @description : 角色POJO类
 * @version: 1.0
 */
@Data
public class Role {
  private Integer id;
  private String name;
  private String keyword;
  private String description;
}