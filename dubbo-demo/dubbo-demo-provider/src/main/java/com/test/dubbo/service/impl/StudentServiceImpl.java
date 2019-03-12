package com.test.dubbo.service.impl;

import com.test.dubbo.dao.entity.Student;
import com.test.dubbo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: wangsaichao
 * @date: 2019/3/11
 * @description:
 */
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public Student selectById(Long id) {

        logger.info("=====>@Before 请求参数： {}",id);

        //这里写业务逻辑

        Student student = new Student();
        student.setId(id);
        student.setName("王赛超");
        student.setAge(18);
        student.setAddress("河北邯郸");

        logger.info("=====>@AfterReturning 响应内容为：{}",student);

        return student;
    }
}
