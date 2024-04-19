package com.myspringprojects.springcore.common;

import com.myspringprojects.springcore.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component annotation marks class as bean class.
//@Primary annotation tells controller that this component has primary priority
// for component selection and consumption. Multiple @Primary for components makes ambiguity and error.
// @Qualifier has higher priority than @Primary annotation.
@Component
@Primary
//Single instance will be created for this bean.
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

//To set bean scope to prototype
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public  CricketCoach(){
        System.out.println("Inside cricket");
    }

    //Define init method
    @PostConstruct
    public void doMyStartup(){
        System.out.println("Init method after bean initiation");
    }

    //Define destroy method
    @PreDestroy
    public void doCleanup(){
        System.out.println("end of bean cleanup");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
