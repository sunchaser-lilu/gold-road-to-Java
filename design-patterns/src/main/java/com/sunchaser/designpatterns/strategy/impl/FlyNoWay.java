package com.sunchaser.designpatterns.strategy.impl;

import com.sunchaser.designpatterns.strategy.FlyBehavior;

/**
 * @author sunchaser
 * @date 2019/9/12
 * @description 不能飞的行为
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}