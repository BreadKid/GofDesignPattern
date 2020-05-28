package com.breadykid.design_pattern.observerPattern.smartListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Joyce Liu
 * @create: 2020-05-28 16:41
 */
@Service("observerServiceSmart")
public class UseService {

    @Autowired
    private ApplicationContext context;

    /**
     * 业务逻辑
     */
    public void feature(String param) {
        FeatureEvent event = new FeatureEvent(param);
        // 事件的所有监听实现类都会执行
        context.publishEvent(event);
    }
}
