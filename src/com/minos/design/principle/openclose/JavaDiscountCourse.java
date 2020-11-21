package com.minos.design.principle.openclose;

/**
 * @Author: minos
 * @Date: 2020/11/21 20:01
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 原价
     * @return
     */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    /**
     * 以继承的方式实现扩展来达到修改价格的目的
     *
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
