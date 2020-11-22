package com.minos.design.pattern.creational.factorymethod;

/**
 * @Author: minos
 * @Date: 2020/11/22 20:49
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("前端视频");
    }
}
