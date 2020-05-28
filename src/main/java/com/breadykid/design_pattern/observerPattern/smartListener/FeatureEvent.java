package com.breadykid.design_pattern.observerPattern.smartListener;

import org.springframework.context.ApplicationEvent;

/**
 * @description: 事件
 * @author: Joyce Liu
 * @create: 2020-05-28 19:05
 */
public class FeatureEvent extends ApplicationEvent {

    public FeatureEvent(Object source) {
        super(source);
    }
}
