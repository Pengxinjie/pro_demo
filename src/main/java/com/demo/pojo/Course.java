package com.demo.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description : 学科POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class Course {
    private Integer id;
    private String name;    // 学科名
    private String icon;    //
    private String createDate;
    private Integer isShow;     // 0 显示  1 不显示
    private Integer userId;
    private Integer orderNo;    // 显示顺序权重，提高该值的显示顺序
    //  学科下的目录列表
    private List<Catalog> catalogList;
    //  学科下的标签列表
    private List<Tag> tagList;

    // 扩展字段，用户前端页面显示
    private String creator; // 创建者
    private Integer catalogQty; // 学科目录数量
    private Integer tagQty;     // 学科标签数量
    private Integer questionQty; // 题目数量
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getCatalogQty() {
        return catalogQty;
    }

    public void setCatalogQty(Integer catalogQty) {
        this.catalogQty = catalogQty;
    }

    public Integer getTagQty() {
        return tagQty;
    }

    public void setTagQty(Integer tagQty) {
        this.tagQty = tagQty;
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
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", createDate='" + createDate + '\'' +
                ", isShow=" + isShow +
                ", userId=" + userId +
                ", orderNo=" + orderNo +
                ", catalogList=" + catalogList +
                ", tagList=" + tagList +
                ", creator='" + creator + '\'' +
                ", catalogQty=" + catalogQty +
                ", tagQty=" + tagQty +
                ", questionQty=" + questionQty +
                ", title='" + title + '\'' +
                '}';
    }
}
