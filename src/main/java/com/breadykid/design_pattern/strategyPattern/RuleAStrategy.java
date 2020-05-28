package com.breadykid.design_pattern.strategyPattern;

import org.springframework.stereotype.Service;

/**
 * @description: 策略实现类A
 * @author: Joyce Liu
 * @create: 2020-05-28 14:40
 */
@Service
public class RuleAStrategy implements CommonStrategy {

    @Override
    public String getStrategyName() {
        return "ruleA";
    }

    @Override
    public void executeStrategy(String param) {
        System.out.println("执行规则A逻辑:"+param);
    }
}
