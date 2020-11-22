package com.minos.design.pattern.creational.abstractfactory;

/**
 * @Author: minos
 * @Date: 2020/11/22 21:31
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
