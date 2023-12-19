package com.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author lin
 * @date 2023/12/20 4:36
 **/
@Mapper
public interface ProblemRecordMapper {

    @Select("select count(*) from problem_record")
    int count();
}
