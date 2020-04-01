package com.wangyong.springaop.Service;

import org.springframework.stereotype.Service;

@Service
public class PerformanceImpl implements Performance {
    @Override
    public void perform(String performer) {
        System.out.println("The " + performer + " is showing !");
    }
}