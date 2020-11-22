package com.minos.design.pattern.creational.factorymethod;

/**
 * @Author: minos
 * @Date: 2020/11/21 23:24
 */
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制PYTHON学习视频");
    }
}
