package com.minos.design.pattern.creational.factorymethod;

/**
 * @Author: minos
 * @Date: 2020/11/22 20:50
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
