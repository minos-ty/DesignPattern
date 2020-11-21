package com.minos.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: minos
 * @Date: 2020/11/21 22:01
 */
public class TeamLeader {

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
