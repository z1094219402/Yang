package com.yang.main.aop;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    /**
     * 返回随机的字符串
     *
     * @param time
     * @return
     */
    public String randUUID(long time) {
        try {
            System.out.println("in randUUID before process!");
            return UUID.randomUUID() + "|" + time;
        } finally {
            System.out.println("in randUUID finally!");
        }
    }
}