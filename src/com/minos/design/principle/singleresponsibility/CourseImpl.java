package com.minos.design.principle.singleresponsibility;

/**
 * @Author: minos
 * @Date: 2020/11/21 21:28
 */
public class CourseImpl implements ICourseContent, ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
