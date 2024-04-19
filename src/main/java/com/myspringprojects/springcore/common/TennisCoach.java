package com.myspringprojects.springcore.common;

import com.myspringprojects.springcore.common.Coach;
import org.springframework.stereotype.Component;

//@Component tells that this class referred as bean to be consumed.
@Component
public class TennisCoach implements Coach {

    public  TennisCoach(){
        System.out.println("Tennis coach class");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice for 10 minutes.";
    }
}
