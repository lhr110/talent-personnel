package com.talent.personnel.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.talent")
@MapperScan({"com.talent.personnel.core.dao.dbmapper"})
public class TalentPersonnelApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TalentPersonnelApiApplication.class, args);
    }
}
