package com.breadykid.design_pattern;

import com.breadykid.design_pattern.observerPattern.smartListener.UseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Joyce Liu
 * @create: 2020-05-28 19:13
 */
public class ObserverTest extends DesignPatternApplicationTests {

    @Autowired
    private UseService service;

    @Test
    public void test() {
        String param = "test";
        service.feature(param);
    }
}
