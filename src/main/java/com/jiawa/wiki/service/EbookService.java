package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.pojo.Ebook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Chen
 * @date 2021/10/20 16:12
 * @description
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
