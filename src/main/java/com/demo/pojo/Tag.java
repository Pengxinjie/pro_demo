package com.demo.pojo;

import lombok.Data;

/**
 * @description : 标签POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class Tag {
    private Integer id;
    private String name;        // 标签名
    private String createDate;
    private Integer status;       // 0 启动 1 禁用
    private Integer userId;
    private Integer courseId;
    private Integer orderNo;
    // 扩展字段，用于前台显示
    private String creator;   // 创建者
    private Integer questionQty;   // 面试题数量
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getQuestionQty() {
        return questionQty;
    }

    public void setQuestionQty(Integer questionQty) {
        this.questionQty = questionQty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", status=" + status +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", orderNo=" + orderNo +
                ", creator='" + creator + '\'' +
                ", questionQty=" + questionQty +
                ", title='" + title + '\'' +
                '}';
    }
}
