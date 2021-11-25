package com.demo.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description : 公司POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class Company {
    private Integer id;
    private String shortName;   // 公司简称
    private String fullName;    // 公司全称
    private Integer isFamous;   // 是否名企
    private Integer state;
    private String remark;
    private String createDate;
    private Integer cityId;
    private Integer userId;
    private Integer orderNo; // 显示顺序权重，提高该值的显示顺序

    private List<Industry> industryList;
    // 扩展字段
    private String city; // 城市名称
    private List<String> industryNameList; // 所属行业名称列表

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getIsFamous() {
        return isFamous;
    }

    public void setIsFamous(Integer isFamous) {
        this.isFamous = isFamous;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public List<Industry> getIndustryList() {
        return industryList;
    }

    public void setIndustryList(List<Industry> industryList) {
        this.industryList = industryList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getIndustryNameList() {
        return industryNameList;
    }

    public void setIndustryNameList(List<String> industryNameList) {
        this.industryNameList = industryNameList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", isFamous=" + isFamous +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", createDate='" + createDate + '\'' +
                ", cityId=" + cityId +
                ", userId=" + userId +
                ", orderNo=" + orderNo +
                ", industryList=" + industryList +
                ", city='" + city + '\'' +
                ", industryNameList=" + industryNameList +
                '}';
    }
}
