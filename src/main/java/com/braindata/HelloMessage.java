package com.braindata;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/4/13 11:31 上午
 */
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}