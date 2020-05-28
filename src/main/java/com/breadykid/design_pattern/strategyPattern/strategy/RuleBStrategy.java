package com.breadykid.design_pattern.strategyPattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @description: 策略实现类B
 * @author: Joyce Liu
 * @create: 2020-05-28 14:40
 */
@Service
public class RuleBStrategy implements CommonStrategy {

    @Override
    public String getStrategyName() {
        return "ruleB";
    }

    @Override
    public void executeStrategy(String param) {
        System.out.println("执行规则B逻辑:"+param);
    }
}
