package com.myspringprojects.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy annotation will delay instantiation of this bean as annotated with @Lazy.
//
@Lazy
public class TrackCoach implements Coach{
    public  TrackCoach(){
        System.out.println("Track coach class");
    }
    @Override
    public String getDailyWorkout() {
        return "Run 5KM";
    }
}
