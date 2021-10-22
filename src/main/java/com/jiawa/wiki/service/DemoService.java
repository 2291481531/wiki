package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.DemoMapper;
import com.jiawa.wiki.pojo.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Chen
 * @date 2021/10/20 16:12
 * @description
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
