package com.demo.pojo;

import lombok.Data;

import java.util.List;

/**
 * @description : 题目POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
//@Data
public class Question {
    private Integer id;        //ID
    private String number;    //试题编号
    private String subject;    //题干
    private Integer type;        //题目类型： 1. 单选  2. 多选 5. 简答
    private Integer difficulty;    //难度： 0 简单  1. 一般 2. 困难
    private String analysis;        //答案解析
    private String analysisVideo;//答案解析视频
    private String remark;        //
    private Integer isClassic;  //是否精选题目 0 不是, 1 是
    private Integer status;        //题目状态（status）：  0 待发布（待审核、已拒绝）、1 已发布（已审核）、 2 已下架（已审核）
    private Integer reviewStatus; //审核状态（review_status）：  0 待审核、1 已审核、2 已拒绝
    private String createDate;    //创建时间
    private Integer userId;        //用户ID
    private Integer companyId;  //企业id
    private Integer catalogId;   //标签ID
    private Integer courseId;    // 学科ID

    private Integer is_classic;
    // 扩展字段
    private String courseName;            // 学科名称
    private String usedQty;               // 使用次数
    private String creator;               // 录入人员

    private ReviewLog reviewLog;        // 最后一条审核日志

    private List<String> tagNameList;      // 所属标签名称列表
    private List<Tag> tagList;            // 所属标签列表
    private Company company;              // 所属公司
    private Catalog catalog;              // 所属学科目录
    private List<QuestionItem> questionItemList; // 题目选项集合

    // 扩展字段(小程序)
    private String title;   // 题目标题
    private Integer grade;  // 难易度
    private String content; // 内容
    private String video;    // 视频
    private String videoPoster; // 视频封面
    private Integer isFamous;      // 是否名企
    private Integer answerTag;    // 答案标记
    private String answerResult;  // 用户答案
    private Integer answerIsRight; // 回答是否正确
    private Integer isFinished;    // 是否完成
    private Integer isFavorite;    // 是否收藏
    private List<Tag> tags;              // 标签
    private Integer memberId;         // 会员Id
    private List<QuestionItem> selection; // 选项

    /**
     * 为选项按字母编号
     *
     * @return
     */
    public List<QuestionItem> getSelection() {
        Character code = 'A';
        if (selection == null) {
            return null;
        }
        for (QuestionItem questionItem : selection) {
            questionItem.setCode(code.toString());
            code++;
        }
        return selection;
    }

    /**
     * 页面需要boolean类型返回
     *
     * @return
     */
    public boolean getIsFamous() {
        return isFamous != null && isFamous == 1;
    }

    /**
     * 页面需要boolean类型返回
     *
     * @return
     */
    public boolean getIsFinished() {
        return isFinished != null && isFinished == 1;
    }

    /**
     * 页面需要boolean类型返回
     *
     * @return
     */
    public boolean getIsFavorite() {
        return isFavorite != null && isFavorite == 1;
    }

    public Boolean getAnswerIsRight() {
        if (answerIsRight != null) {
            return answerIsRight == 0 || answerIsRight == 2;
        } else {
            return null;
        }
    }

    /*-----------------------------@Data------------------------------*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public String getAnalysisVideo() {
		return analysisVideo;
	}

	public void setAnalysisVideo(String analysisVideo) {
		this.analysisVideo = analysisVideo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIsClassic() {
		return isClassic;
	}

	public void setIsClassic(Integer isClassic) {
		this.isClassic = isClassic;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getIs_classic() {
		return is_classic;
	}

	public void setIs_classic(Integer is_classic) {
		this.is_classic = is_classic;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getUsedQty() {
		return usedQty;
	}

	public void setUsedQty(String usedQty) {
		this.usedQty = usedQty;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public ReviewLog getReviewLog() {
		return reviewLog;
	}

	public void setReviewLog(ReviewLog reviewLog) {
		this.reviewLog = reviewLog;
	}

	public List<String> getTagNameList() {
		return tagNameList;
	}

	public void setTagNameList(List<String> tagNameList) {
		this.tagNameList = tagNameList;
	}

	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public List<QuestionItem> getQuestionItemList() {
		return questionItemList;
	}

	public void setQuestionItemList(List<QuestionItem> questionItemList) {
		this.questionItemList = questionItemList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getVideoPoster() {
		return videoPoster;
	}

	public void setVideoPoster(String videoPoster) {
		this.videoPoster = videoPoster;
	}

	public void setIsFamous(Integer isFamous) {
		this.isFamous = isFamous;
	}

	public Integer getAnswerTag() {
		return answerTag;
	}

	public void setAnswerTag(Integer answerTag) {
		this.answerTag = answerTag;
	}

	public String getAnswerResult() {
		return answerResult;
	}

	public void setAnswerResult(String answerResult) {
		this.answerResult = answerResult;
	}

	public void setAnswerIsRight(Integer answerIsRight) {
		this.answerIsRight = answerIsRight;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public void setIsFavorite(Integer isFavorite) {
		this.isFavorite = isFavorite;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public void setSelection(List<QuestionItem> selection) {
		this.selection = selection;
	}

	@Override
	public String toString() {
		return "Question{" +
				"id=" + id +
				", number='" + number + '\'' +
				", subject='" + subject + '\'' +
				", type=" + type +
				", difficulty=" + difficulty +
				", analysis='" + analysis + '\'' +
				", analysisVideo='" + analysisVideo + '\'' +
				", remark='" + remark + '\'' +
				", isClassic=" + isClassic +
				", status=" + status +
				", reviewStatus=" + reviewStatus +
				", createDate='" + createDate + '\'' +
				", userId=" + userId +
				", companyId=" + companyId +
				", catalogId=" + catalogId +
				", courseId=" + courseId +
				", is_classic=" + is_classic +
				", courseName='" + courseName + '\'' +
				", usedQty='" + usedQty + '\'' +
				", creator='" + creator + '\'' +
				", reviewLog=" + reviewLog +
				", tagNameList=" + tagNameList +
				", tagList=" + tagList +
				", company=" + company +
				", catalog=" + catalog +
				", questionItemList=" + questionItemList +
				", title='" + title + '\'' +
				", grade=" + grade +
				", content='" + content + '\'' +
				", video='" + video + '\'' +
				", videoPoster='" + videoPoster + '\'' +
				", isFamous=" + isFamous +
				", answerTag=" + answerTag +
				", answerResult='" + answerResult + '\'' +
				", answerIsRight=" + answerIsRight +
				", isFinished=" + isFinished +
				", isFavorite=" + isFavorite +
				", tags=" + tags +
				", memberId=" + memberId +
				", selection=" + selection +
				'}';
	}
}
