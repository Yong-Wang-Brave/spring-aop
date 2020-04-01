package com.wangyong.springaop;

import com.wangyong.springaop.Service.Performance;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
@ComponentScan("com.wangyong.springaop.Service")
class SpringaopApplicationTests {

    @Resource
    Performance performance;

    @Test
    public void test() {

        performance.perform("lumin");

    }
}
