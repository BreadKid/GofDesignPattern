package com.breadykid.design_pattern.observerPattern.eventListener;

import com.breadykid.design_pattern.observerPattern.smartListener.FeatureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * @description:
 * @author: Joyce Liu
 * @create: 2020-05-28 20:31
 */
public class FeatureListener {

    @EventListener
    @Order(0)
    public void a(FeatureEvent event) {
        Object source = event.getSource();
        System.out.println("逻辑A实现");
    }

    @EventListener(value = {FeatureEvent.class})
    @Order(1)
    public void b() {
        System.out.println("逻辑B实现");
    }

    @EventListener
    @Order(2)
    public void c(FeatureEvent event) {
        System.out.println("逻辑C实现");
    }

    @EventListener
    @Async
    public void d(FeatureEvent event) {
        System.out.println("逻辑D异步实现");
    }

}
