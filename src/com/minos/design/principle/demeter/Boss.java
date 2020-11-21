package com.minos.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: minos
 * @Date: 2020/11/21 22:01
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        // Course不算Boss的朋友  **出现在成员变量、方法输入、输出参数中的类称为成员朋友
//        List<Course> courseList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
        teamLeader.checkNumberOfCourses();
    }


}
