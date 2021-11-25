package com.demo.controller;

import com.demo.constants.Constants;
import com.demo.entity.PageResult;
import com.demo.entity.QueryPageBean;
import com.demo.entity.Result;
import com.demo.pojo.Course;
import com.demo.pojo.User;
import com.demo.service.CourseService;
import com.demo.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/add")
    public Result addCourse(@RequestBody Course course, HttpSession session) throws IOException {
        try {
            //1. 设置course的其它数据:createDate、userId、orderNo
            course.setCreateDate(DateUtils.parseDate2String(new Date()));
            course.setOrderNo(1);
            //从session中获取当前的用户
            User user = (User) session.getAttribute(Constants.USER_SESSION_KEY);
            course.setUserId(user.getId());

            //2. 调用业务层的方法保存学科course的信息
            courseService.addCourse(course);
            //添加学科成功
            return new Result(true,"添加学科成功");
        } catch (Exception e) {
            e.printStackTrace();
            //添加学科失败
            return new Result(false,"添加学科失败");
        }
    }

    @RequestMapping("/list")
    public Result list(@RequestBody QueryPageBean queryPageBean) throws IOException {
        try {
            //调用业务层的方法，查询数据
            PageResult pageResult = courseService.findByPage(queryPageBean);
            //分页查询数据成功
            return new Result(true,"查询学科分页列表成功",pageResult);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"查询学科分页列表失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody Course course) throws IOException {
        try {
            //1. 调用业务层的方法修改学科信息
            courseService.updateCourse(course);
            //修改成功
            return new Result(true,"修改学科信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改学科信息失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(int id) throws IOException {
        try {
            //1. 调用业务层的方法，根据id删除学科信息
            courseService.deleteById(id);
            //删除成功
            return new Result(true,"删除学科信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,e.getMessage());
        }
    }

    @RequestMapping("/findAll")
    public Result findAll(@RequestBody Map parameterMap) throws IOException {
        try {
            //调用业务层的方法，查询所有学科
            List<Course> courseList = courseService.findAll(parameterMap);

            return new Result(true,"获取学科列表成功",courseList);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"获取学科列表失败");
        }
    }
}
