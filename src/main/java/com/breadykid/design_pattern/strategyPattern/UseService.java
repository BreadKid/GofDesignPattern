package com.breadykid.design_pattern.strategyPattern;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 业务场景使用
 * @author: Joyce Liu
 * @create: 2020-05-28 15:58
 */
@Service("strategyService")
public class UseService {

    Map<String,CommonStrategy> strategyMap = new HashMap<>();

    /**
     * Spring加载时自动获取接口的所有实现类
     * 参考Spring启动机制，Bean自动加载
     *
     * @param strategyList 接口的所有实现类
     */
    public UseService(List<CommonStrategy> strategyList) {
        for (CommonStrategy strategy:strategyList) {
            strategyMap.put(strategy.getStrategyName(),strategy);
        }
    }

    public void use(String name, String param) {
        if (strategyMap.containsKey(name)) {
            strategyMap.get(name).executeStrategy(param);
        }
        else {
            System.err.println("异常数据时，排除报错可能:"+name+param);
        }
    }

}
