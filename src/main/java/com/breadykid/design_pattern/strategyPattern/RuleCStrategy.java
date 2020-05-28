package com.breadykid.design_pattern.strategyPattern;

import org.springframework.stereotype.Service;

/**
 * @description: 策略实现类C
 * @author: Joyce Liu
 * @create: 2020-05-28 14:40
 */
@Service
public class RuleCStrategy implements CommonStrategy {

    @Override
    public String getStrategyName() {
        return "ruleC";
    }

    @Override
    public void executeStrategy(String param) {
        System.out.println("执行规则C逻辑:"+param);
    }
}
