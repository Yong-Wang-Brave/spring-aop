package com.wangyong.springaop.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
class Audience {
    /**
     * 定义一个切点，增加复用性
     */
   /* @Pointcut("execution(* com.wangyong.springaop.Service.Performance.perform(..))")
    public void perform() {
    }

    @Before("perform()")
    public void silencePhoneCalls() {
        System.out.println("silencing phone calls");
    }

    @After("perform()")
    public void takeSeats() {
        System.out.println("taking seats");
    }

    @AfterReturning("perform()")
    public void clap() {
        System.out.println("CLAP! CLAP! CLAP!");
    }

    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("demand a refund");
    }*/
    @Pointcut("execution(* com.wangyong.springaop.Service.Performance.perform(..)) && args(performer)")
    public void perform(String performer) {
    }

    @Around("perform(performer)")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint, String performer) {
        try {
            System.out.println("silence phone calls");
            System.out.println("taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("CLAP! CLAP! CLAP! for " + performer + "'s wonderful show!");
        }catch (Throwable t) {
            System.out.println("demand a refund");
        }
    }
}