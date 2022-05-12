package com.example.task13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;

@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String last_name;
    @Value("${student.group}")
    private String group;

    @Value("Karina")
    private String name1;
    @Value("Sheveleva")
    private String last_name1;
    @Value("IKBO-10-20")
    private String group1;

    @PreDestroy
    public void init(){
        System.out.println( name +  " " + last_name + " " + group);
        System.out.println( name1 +  " " + last_name1 + " " + group1);
    }
}
