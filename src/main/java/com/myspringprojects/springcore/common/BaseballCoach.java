package com.myspringprojects.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    //Constructor with println for @Lazy annotation check.
    public  BaseballCoach(){
        System.out.println("Inside baseball constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice batting";
    }
}
