package com.breadykid.strategyPattern.strategy;

public interface CommonStrategy {
    public String getStrategyName();
    public void executeStrategy(String param);
}
