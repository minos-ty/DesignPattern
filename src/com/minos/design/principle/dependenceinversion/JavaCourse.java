package com.minos.design.principle.dependenceinversion;

/**
 * @Author: minos
 * @Date: 2020/11/21 20:28
 */
public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Minos are learning java course");
    }
}
