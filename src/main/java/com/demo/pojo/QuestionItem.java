package com.demo.pojo;

import lombok.Data;

/**
 * @description : 题目选项POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class QuestionItem {

    private Integer id;
    private String content;
    private String imgUrl;
    private Integer isRight;
    private Integer questionId;
    // 扩展字段
    private String code;
    private String title;

    /**
     * 页面返回时需要boolean类型
     *
     * @return
     */
    public boolean getIsRight() {
        return isRight == 1;
    }

    /* -------------------@Data------------------- */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setIsRight(Integer isRight) {
        this.isRight = isRight;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "QuestionItem{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", isRight=" + isRight +
                ", questionId=" + questionId +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
