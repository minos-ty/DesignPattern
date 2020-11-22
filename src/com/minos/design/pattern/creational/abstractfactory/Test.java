package com.minos.design.pattern.creational.abstractfactory;

/**
 * @Author: minos
 * @Date: 2020/11/22 21:46
 */
public class Test {

    public static void main(String[] args) {
      CourseFactory courseFactory = new JavaCourseFactory();
      Video video = courseFactory.getVideo();
      Article article = courseFactory.getArticle();
      video.produce();
      article.produce();

    }
}
