package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.TestMapper;
import com.jiawa.wiki.pojo.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Chen
 * @date 2021/10/20 16:12
 * @description
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
