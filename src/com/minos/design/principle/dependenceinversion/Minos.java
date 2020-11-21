package com.minos.design.principle.dependenceinversion;

/**
 * @Author: minos
 * @Date: 2020/11/21 20:21
 */
public class Minos {

    private ICourse iCourse;


    public void studyIMoocCourse() {
        iCourse.studyCourse();
    }

    // setter注入
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    // 构造器注入
//    public Minos(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }


    // 接口注入
//    public void studyIMoocCourse(ICourse iCourse) {
//
//        iCourse.studyCourse();
//   }
}
