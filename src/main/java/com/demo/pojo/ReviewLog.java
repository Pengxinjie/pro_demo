package com.demo.pojo;

import lombok.Data;

/**
 * @description : 题目审核POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class ReviewLog {

    private Integer id;
    private String comments;
    private Integer status;
    private Integer questionId;
    private Integer userId;
    private String createDate;
    // 扩展字段
    private String reviewer;       // 审核人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "ReviewLog{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                ", status=" + status +
                ", questionId=" + questionId +
                ", userId=" + userId +
                ", createDate='" + createDate + '\'' +
                ", reviewer='" + reviewer + '\'' +
                '}';
    }
}
