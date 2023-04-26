package org.example.spring_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.spring_demo.entity.MemberInfo;

import java.util.Map;

public interface MemberMapper extends BaseMapper {
    Map<String,Object> searchByMap(MemberInfo memberInfo);
    Map<String,Object> searchByMap1(MemberInfo memberInfo);
}
