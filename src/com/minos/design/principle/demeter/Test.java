package com.minos.design.principle.demeter;

/**
 * @Author: minos
 * @Date: 2020/11/21 22:07
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
