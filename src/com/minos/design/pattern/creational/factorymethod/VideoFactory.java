package com.minos.design.pattern.creational.factorymethod;

/**
 * 注意： 工厂方法
 *       实际创建类的工作交给子类
 *       每个类有专门的工厂来生产，而不是全都在一个工厂产
 *
 * @Author: minos
 * @Date: 2020/11/21 23:27
 */
public abstract class VideoFactory {

    public abstract Video getVideo();

}
