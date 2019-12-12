package com.example.demo.demo;

import com.example.demo.demo.TestDao;
import com.example.demo.demo.TestDto;

import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;


@Controller
public class TestController {

    @Autowired
    DataSource dataSource;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    TestDao testDao;

    @RequestMapping("/check")
    public String test() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(sqlSessionFactory.getClass());
        System.out.println(sqlSessionTemplate.getClass());
        System.out.println(dataSource.getConnection());
        return "test";
    }

    @RequestMapping("/1")
    public String create() {
        TestDto testDto = new TestDto();
        testDto.setId("1");
        testDto.setComment("Comment");
        testDao.create(testDto);
        return "create";
    }

    @RequestMapping("/2")
    public String read() {
        TestDto testDto = new TestDto();
        testDto.setId("1");
//        System.out.println(testDao.selectList());
//        System.out.println(testDao.selectOne(testDto));
        return "read";
    }

    @RequestMapping("/3")
    public String update() {
        TestDto testDto = new TestDto();
        testDto.setId("1");
        testDto.setComment("update");
//        testDao.update(testDto);
        return "update";
    }

    @RequestMapping("/4")
    public String delete() {
        TestDto testDto = new TestDto();
        testDto.setId("1");
//        testDao.delete(testDto);
        return "delete";
    }
}
