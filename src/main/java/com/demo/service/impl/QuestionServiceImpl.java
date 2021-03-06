package com.demo.service.impl;

import com.demo.dao.QuestionDao;
import com.demo.dao.QuestionItemDao;
import com.demo.entity.PageResult;
import com.demo.entity.QueryPageBean;
import com.demo.pojo.Question;
import com.demo.pojo.QuestionItem;
import com.demo.pojo.Tag;
import com.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private QuestionItemDao questionItemDao;
    @Override
    public PageResult findBasicQuestionListByPage(QueryPageBean queryPageBean) throws Exception {
        //1. 查询总条数
        Long basicCount = questionDao.findBasicQuestionCount(queryPageBean);

        //2. 查询当前页的基础试题集合
        List<Question> basicList = questionDao.findBasicQuestionList(queryPageBean);
        return new PageResult(basicCount,basicList);
    }

    @Override
    @Transactional
    public void add(Question question){
        //1. 将题目自身的。信息存储到t_question表
        questionDao.add(question);

        //2. 将题目的选项信息存储到t_question_item表
        //获取题目选项列表
        List<QuestionItem> questionItemList = question.getQuestionItemList();
        if (questionItemList != null) {
            for (QuestionItem questionItem : questionItemList) {
                //遍历出每一个题目选项
                //添加之前，设置每一个选项的所属试题的id(questionId)
                questionItem.setQuestionId(question.getId());
                //添加每一个选项
                questionItemDao.add(questionItem);
            }
        }

        //3. 关联题目和tag(标签)
        //获取该题目的标签列表
        List<Tag> tagList = question.getTagList();
        //遍历出每一个标签
        if (tagList != null) {
            for (Tag tag : tagList) {
                //封装要存储到数据库的数据
                Map parameterMap = new HashMap();
                parameterMap.put("questionId", question.getId());
                parameterMap.put("tagId", tag.getId());
                questionDao.associationQuestionAndTag(parameterMap);
            }
        }
    }
}
