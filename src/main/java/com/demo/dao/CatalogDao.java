package com.demo.dao;

import com.demo.pojo.Catalog;

import java.util.List;

public interface CatalogDao {
    Long findCatalogCountByCourseId(int courseId);

    /**
     * 查询某个学科的所有二级目录
     * @param courseId
     * @return
     */
    List<Catalog> findCatalogListByCourseId(int courseId);
}
