//package com.example.demo.demo;
//
//import org.apache.ibatis.annotations.*;
//
//import java.util.List;
//
//@Mapper
//public interface MapperAnnotation {
//    @Select("SELECT * FROM testtable")
//    List selectList();
//
//    @Select("SELECT * FROM testtable WHERE id = #{id}")
//    TestDto selectOne(TestDto testDto);
//
//    @Insert("INSERT INTO testtable () VALUES (#{id}, #{comment})")
//    int create(TestDto testDto);
//
//    @Update("UPDATE testtable SET comment = #{comment} WHERE id = #{id}")
//    int update(TestDto testDto);
//
//    @Delete("DELETE FROM testtable WHERE id = #{id}")
//    int delete(TestDto testDto);
//}