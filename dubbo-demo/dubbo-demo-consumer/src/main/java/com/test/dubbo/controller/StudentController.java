package com.test.dubbo.controller;

import com.test.dubbo.dao.entity.Student;
import com.test.dubbo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangsaichao
 * @date: 2019/3/11
 * @description:
 */
@RestController
@RequestMapping("/dubbo/test")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("selectById")
    public Student selectById(){
        logger.info("=====>请求消费者");
        return studentService.selectById(1L);
    }


}
