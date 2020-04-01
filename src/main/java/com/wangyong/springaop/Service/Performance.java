package com.wangyong.springaop.Service;

import org.springframework.stereotype.Service;

@Service
public interface Performance {
    /**
     * 抽象的切面，对演出的定义
     */
    void perform(String performer);
}
