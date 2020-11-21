package com.minos.design.pattern.creational.simplefactory;

/**
 * 注意： 简单工厂并不属于GOF23种设计模式
 *
 * @Author: minos
 * @Date: 2020/11/21 23:27
 */
public class VideoFactory {

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }

    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }

        return null;
    }
}
