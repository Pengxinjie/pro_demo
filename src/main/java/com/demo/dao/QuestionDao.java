package com.demo.dao;

import com.demo.entity.QueryPageBean;
import com.demo.pojo.Question;

import java.util.List;
import java.util.Map;

public interface QuestionDao {
    Long findQuestionCountByCourseId(int courseId);

    Long findBasicQuestionCount(QueryPageBean queryPageBean);


    List<Question> findBasicQuestionList(QueryPageBean queryPageBean);

    void add(Question question);

    void associationQuestionAndTag(Map parameterMap);

}
