package com.demo.dao;

import com.demo.pojo.Tag;

import java.util.List;

public interface TagDao {
    Long findTagCountByCourseId(int courseId);

    List<Tag> findTagListByCourseId(int courseId);
}
