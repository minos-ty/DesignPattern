package com.minos.design.pattern.creational.abstractfactory;

/**
 * @Author: minos
 * @Date: 2020/11/22 21:33
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("Java article.");
    }
}
