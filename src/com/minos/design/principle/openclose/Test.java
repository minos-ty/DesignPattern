package com.minos.design.principle.openclose;

/**
 * @Author: minos
 * @Date: 2020/11/21 19:52
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        // 实际项目中控制台打印是不用的
        System.out.println("课程ID：" + javaCourse.getId() + "  课程名称：" + javaCourse.getName()
                + "  课程原价：" + javaCourse.getOriginPrice() + "  课程折后价格：" + javaCourse.getPrice());
    }
}
