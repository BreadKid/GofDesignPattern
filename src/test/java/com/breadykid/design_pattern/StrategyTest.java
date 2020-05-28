package com.breadykid.design_pattern;

import com.breadykid.design_pattern.strategyPattern.strategy.UseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 策略模式单测
 * @author: Joyce Liu
 * @create: 2020-05-28 15:51
 */
public class StrategyTest extends DesignPatternApplicationTests {

    @Autowired
    private UseService useService;

    @Test
    public void testErr() {
        String name = "error";
        String param = "test";
        useService.use(name, param);
    }

    @Test
    public void testPass() {
        String name = "ruleA";
        String param = "test";
        useService.use(name, param);
    }
}
