package com.minos.design.pattern.creational.simplefactory;

/**
 * @Author: minos
 * @Date: 2020/11/21 23:24
 */
public class Test {

    public static void main(String[] args) {

//        Video video = new JavaVideo();
//        video.produce();

//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
