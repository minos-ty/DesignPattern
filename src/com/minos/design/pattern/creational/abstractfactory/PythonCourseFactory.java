package com.minos.design.pattern.creational.abstractfactory;

/**
 * @Author: minos
 * @Date: 2020/11/22 21:38
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
