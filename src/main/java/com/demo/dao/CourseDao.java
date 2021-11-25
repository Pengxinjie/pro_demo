package com.demo.dao;

import com.demo.entity.QueryPageBean;
import com.demo.pojo.Course;

import java.util.List;
import java.util.Map;

public interface CourseDao {
    void add(Course course);

    Long findTotalCourse(QueryPageBean queryPageBean);

    List<Course> findCourseListByPage(QueryPageBean queryPageBean);

    void update(Course course);

    void deleteById(Integer id);

    List<Course> findAll(Map parameterMap);
}
