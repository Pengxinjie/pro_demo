package com.demo.pojo;

import lombok.Data;

/**
 * @description : 学科目录POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class Catalog {
    private Integer id;
    private String name;  // 学科目录名
    private String createDate;
    private Integer status;   // 0 启动 1 禁用
    private Integer userId;
    private Integer courseId;
    private Integer orderNo; // 显示顺序权重，提高该值的显示顺序
    // 扩展字段，用于前台显示
    private String creator; // 创建者
    private Integer questionQty;   // 面试题数量;
    private Course course;  // 所属学科
    private String courseName;  // 所属学科名称

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", status=" + status +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", orderNo=" + orderNo +
                ", creator='" + creator + '\'' +
                ", questionQty=" + questionQty +
                ", course=" + course +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
