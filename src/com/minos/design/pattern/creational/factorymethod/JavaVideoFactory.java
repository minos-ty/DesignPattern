package com.minos.design.pattern.creational.factorymethod;

/**
 * @Author: minos
 * @Date: 2020/11/22 20:32
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
