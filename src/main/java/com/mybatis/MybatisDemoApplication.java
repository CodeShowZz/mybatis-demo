package com.mybatis;

import com.mybatis.mapper.ProblemRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-18 15:59
 */
@SpringBootApplication
public class MybatisDemoApplication implements CommandLineRunner {


    private final ProblemRecordMapper problemRecordMapper;

    public MybatisDemoApplication(ProblemRecordMapper problemRecordMapper) {
        this.problemRecordMapper = problemRecordMapper;
    }


    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int count = problemRecordMapper.count();
        System.out.println("count:" + count);
    }
}