package com.demo.pojo;

import lombok.Data;

import java.util.List;

/**
 * 扩展字段为非数据库表对应字段
 *
 * @version: 1.0
 */
//@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer state;
    private String email;
    private String source;
    private String createDate;
    private String remark;
    // 扩展字段
    private List<String> authorityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<String> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<String> authorityList) {
        this.authorityList = authorityList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                ", email='" + email + '\'' +
                ", source='" + source + '\'' +
                ", createDate='" + createDate + '\'' +
                ", remark='" + remark + '\'' +
                ", authorityList=" + authorityList +
                '}';
    }
}
