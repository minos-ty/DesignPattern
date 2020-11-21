package com.minos.design.principle.dependenceinversion;

/**
 * @Author: minos
 * @Date: 2020/11/21 20:23
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Minos minos = new Minos();
//        minos.studyJavaCourse();
//        minos.studyFECourse();
//    }

    //v2 接口方法注入
//    public static void main(String[] args) {
//        Minos minos = new Minos();
//        minos.studyIMoocCourse(new JavaCourse());
//        minos.studyIMoocCourse(new FECourse());
//        minos.studyIMoocCourse(new PythonCourse());
//    }

    //v3 构造器注入
//    public static void main(String[] args) {
//        Minos minos = new Minos(new JavaCourse());
//        minos.studyIMoocCourse();
//    }

    public static void main(String[] args) {
        Minos minos = new Minos();

        minos.setiCourse(new PythonCourse());
        minos.studyIMoocCourse();

        minos.setiCourse(new JavaCourse());
        minos.studyIMoocCourse();
    }
}
