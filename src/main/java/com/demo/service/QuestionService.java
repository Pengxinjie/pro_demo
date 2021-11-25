package com.demo.service;

import com.demo.entity.PageResult;
import com.demo.entity.QueryPageBean;
import com.demo.pojo.Question;

public interface QuestionService {
    PageResult findBasicQuestionListByPage(QueryPageBean queryPageBean) throws Exception;

    void add(Question question);
}
