package org.example.spring_demo;

import org.example.spring_demo.entity.MemberInfo;
import org.example.spring_demo.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StartTest {
    @Autowired
    private MemberMapper memberMapper;
    @Test
    public void searchByMap1(){
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setId(1);
        memberInfo.setCreateTime("2023-04-26 11:21:26");
        Assert.notNull(memberMapper.searchByMap1(memberInfo));
    }
    @Test
    public void searchByMap(){
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setId(1);
        memberInfo.setCreateTime("2023-04-26 11:21:26");
        Assert.notNull(memberMapper.searchByMap(memberInfo));
    }

}