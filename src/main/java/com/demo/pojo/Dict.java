package com.demo.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description : 数据字典POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class Dict {
    private Integer id;
    private Integer pid;
    private Integer dataType;   // 数据类型，0-表示省 1-表示城市
    private String dataCode;    // 数据编码，
    private String dataValue;   // 数据值
    private Integer dataTag;    // 数据标记，比如省市列表中，0 表示不首页显示 1首页显示，根据业务定义
    private String dataDesc;
    private Integer orderNo;    // 显示顺序权重，提高该值的显示顺序

    // 二级数据
    private List<Dict> subList;
    // 扩展字段
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public Integer getDataTag() {
        return dataTag;
    }

    public void setDataTag(Integer dataTag) {
        this.dataTag = dataTag;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public List<Dict> getSubList() {
        return subList;
    }

    public void setSubList(List<Dict> subList) {
        this.subList = subList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", pid=" + pid +
                ", dataType=" + dataType +
                ", dataCode='" + dataCode + '\'' +
                ", dataValue='" + dataValue + '\'' +
                ", dataTag=" + dataTag +
                ", dataDesc='" + dataDesc + '\'' +
                ", orderNo=" + orderNo +
                ", subList=" + subList +
                ", title='" + title + '\'' +
                '}';
    }
}
