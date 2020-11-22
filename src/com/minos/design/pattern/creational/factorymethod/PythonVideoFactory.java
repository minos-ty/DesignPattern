package com.minos.design.pattern.creational.factorymethod;

/**
 * @Author: minos
 * @Date: 2020/11/22 20:33
 */
public class PythonVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
