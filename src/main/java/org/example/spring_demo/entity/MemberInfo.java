package org.example.spring_demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: myl86
 * @create: 2023-04-26 11:09
 **/
@Data
public class MemberInfo {
    private Integer id;
    private String name;
    private String tel;
    private String createTime;
}
