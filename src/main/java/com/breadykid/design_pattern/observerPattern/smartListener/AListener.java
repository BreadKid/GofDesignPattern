package com.breadykid.design_pattern.observerPattern.smartListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @description: 逻辑实现类
 * @author: Joyce Liu
 * @create: 2020-05-28 19:08
 */
@Component
public class AListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == FeatureEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == String.class;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Object source = event.getSource();
        System.out.println("逻辑A实现:"+source);
    }

}
