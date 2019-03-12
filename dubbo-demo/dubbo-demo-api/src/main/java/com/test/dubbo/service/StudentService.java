package com.test.dubbo.service;

import com.test.dubbo.dao.entity.Student;

/**
 * @author: WangSaiChao
 * @date: 2019/3/11
 * @description: service
 */
public interface StudentService {

    Student selectById(Long id);
}
