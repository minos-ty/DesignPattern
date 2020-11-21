package com.minos.design.principle.dependenceinversion;

/**
 * @Author: minos
 * @Date: 2020/11/21 20:29
 */
public class FECourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("Minos are learning FE course");
    }
}
