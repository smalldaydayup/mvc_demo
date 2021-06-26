package com.example.mvc_demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangkun
 */
@Service
@Transactional(rollbackFor = {})
public class BookServiceImpl implements BookService {

    public BookServiceImpl() {}

    /**
     * 获取广告 title
     *
     * @return
     */
    @Override
    public String getAdTitle() {
        return "ni hao";
    }


    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>();
        map.put(new Long(5L), "sp");
        map.put(new Long(6L), "sd");
        System.out.println(map.get(5L));
    }
}
