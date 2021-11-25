package com.demo.pojo;

import lombok.Data;

/**
 * @description : 行业方向POJO类
 * @version: 1.0
 */
//@Data
public class Industry {

    private Integer id;
    private String name;
    private String remark;
    private Integer orderNo;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", orderNo=" + orderNo +
                '}';
    }
}
