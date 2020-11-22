package com.minos.design.pattern.creational.factorymethod;

/**
 * @Author: minos
 * @Date: 2020/11/21 23:24
 */
public class Test {

    public static void main(String[] args) {
        // 父类引用指向子类实现
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
