package com.minos.design.pattern.creational.abstractfactory;

/**
 * @Author: minos
 * @Date: 2020/11/22 21:37
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("Python article.");
    }
}
