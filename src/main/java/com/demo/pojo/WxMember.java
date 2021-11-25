package com.demo.pojo;

import lombok.Data;

/**
 * @description : 成员POJO类
 * @version: 1.0
 */
//@Data
public class WxMember {

    private int id;
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String city;
    private String province;
    private String country;
    private String language;
    private String openId;
    private String unionId;
    private String createTime;
    private Integer courseId;
    private Integer cityId;
    private Integer lastCategoryKind; // 最后做题分类种类 按技术（学科目录）-1、按企业-2、按方向-3
    private Integer lastCategoryType; // 最后做题分类类型  101-刷题,、201-错题本、202-我的练习、203-收藏题目
    private Integer lastCategoryId;   // 最后做题分类种类列表项Id  种类为1，代表学科目录ID，种类2，代表企业ID，种类3，代表行业方向Id
    private Integer lastQuestionId;   // 最后题目Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getLastCategoryKind() {
        return lastCategoryKind;
    }

    public void setLastCategoryKind(Integer lastCategoryKind) {
        this.lastCategoryKind = lastCategoryKind;
    }

    public Integer getLastCategoryType() {
        return lastCategoryType;
    }

    public void setLastCategoryType(Integer lastCategoryType) {
        this.lastCategoryType = lastCategoryType;
    }

    public Integer getLastCategoryId() {
        return lastCategoryId;
    }

    public void setLastCategoryId(Integer lastCategoryId) {
        this.lastCategoryId = lastCategoryId;
    }

    public Integer getLastQuestionId() {
        return lastQuestionId;
    }

    public void setLastQuestionId(Integer lastQuestionId) {
        this.lastQuestionId = lastQuestionId;
    }

    @Override
    public String toString() {
        return "WxMember{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", openId='" + openId + '\'' +
                ", unionId='" + unionId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", courseId=" + courseId +
                ", cityId=" + cityId +
                ", lastCategoryKind=" + lastCategoryKind +
                ", lastCategoryType=" + lastCategoryType +
                ", lastCategoryId=" + lastCategoryId +
                ", lastQuestionId=" + lastQuestionId +
                '}';
    }
}
