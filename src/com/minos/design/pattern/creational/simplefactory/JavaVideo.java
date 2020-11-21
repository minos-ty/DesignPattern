package com.minos.design.pattern.creational.simplefactory;

/**
 * @Author: minos
 * @Date: 2020/11/21 23:18
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制JAVA学习视频");
    }
}
