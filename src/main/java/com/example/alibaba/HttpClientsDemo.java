package com.example.alibaba;

import com.alibaba.fastjson.JSON;

/**
 * @author Liq
 * @date 2020/1/3
 */
public class HttpClientsDemo {

    public static void main(String[] args) {

//        Person person = null;
//
//        for (int i = 0; i < 100; i++) {
//            person = new Person();
//            person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
//            person.setCompanyId(1);
//            person.setName("gg" + i);
//            HttpClientUtils
//                .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
//        }
//

        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();
        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();
        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();
        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();
        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();
        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();
        new Thread(() -> {
            Person person = null;
            for (int i = 0; i < 100; i++) {
                person = new Person();
                person.setCardNumber("41132919980320" + (int)((Math.random()*9+1)*1000));
                person.setCompanyId(1);
                person.setName("gg" + i);
                HttpClientUtils
                    .videoPost("http://61.155.157.42:19010/person/add", "1", JSON.toJSONString(person));
            }
        }).start();

    }




}
