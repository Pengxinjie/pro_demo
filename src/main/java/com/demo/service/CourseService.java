package com.demo.service;

import com.demo.entity.PageResult;
import com.demo.entity.QueryPageBean;
import com.demo.pojo.Course;

import java.util.List;
import java.util.Map;

public interface CourseService {
    void addCourse(Course course) throws Exception;

    PageResult findByPage(QueryPageBean queryPageBean) throws Exception;

    void updateCourse(Course course) throws Exception;

    void deleteById(Integer id) throws Exception;

    List<Course> findAll(Map parameterMap) throws Exception;
}
