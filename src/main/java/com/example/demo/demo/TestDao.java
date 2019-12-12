package com.example.demo.demo;

import com.example.demo.demo.TestDto;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("TestDao")
public class TestDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

//    public List<TestDto> selectList() {
//        return sqlSessionTemplate.selectList("com.example.demo.demo.TestDao.selectList");
//    }
//
//    public TestDto selectOne(TestDto testDto) {
//        return sqlSessionTemplate.selectOne("com.example.demo.demo.TestDao.selectOne", testDto);
//    }

    public int create(TestDto testDto) {
        return sqlSessionTemplate.insert("com.example.demo.demo.TestDao.create", testDto);
    }
//
//    public int update(TestDto testDto) {
//        return sqlSessionTemplate.update("com.example.demo.demo.TestDao.update", testDto);
//    }
//
//    public int delete(TestDto testDto) {
//        return sqlSessionTemplate.delete("com.example.demo.demo.TestDao.delete", testDto);
//    }
}
