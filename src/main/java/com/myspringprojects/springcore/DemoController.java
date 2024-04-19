package com.myspringprojects.springcore;

import com.myspringprojects.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Declare variable for dependency injection.
    private Coach myCoach;

    //Declare variable for bean scope example.
    private Coach newCoach;

    //DemoController is constructor for dependency injection.
    //@Qualifier annotation is used to specify which component to be consumed.
    // Qualifier name starts with small case.

    //@Primary annotation also can be used for specifying which component to be consumed.

    /* Initialization
    When application starts, all beans are initialize (classes annotated with @Component).
    Spring will create instance of each bean and make them available.
    Instead of upfront initialization of each bean, tell spring to initialize only those beans which
    has dependency injection or explicitly requested.
    This can be done in two ways,
    1. @Lazy annotation on class level.
    2. Edit application.properties file to make application by default delay instantiation.
    spring.main.lazy-initialization=true
    * */

    /*Bean scope
    To understand that each bean is has singleton instance,created two variables of type cricketCoach.
    By default, both will point to same bean instance of type cricketCoach.
    If annotate bean component with bean scope prototype will have diffrant instances of cricketCoach.
    * */
   /* @Autowired
    private DemoController(@Qualifier("cricketCoach") Coach theCoach,
                           @Qualifier("cricketCoach") Coach newCoach){
        System.out.println("Inside controller constructor.");
      myCoach=theCoach;
      this.newCoach=newCoach;
    }
    **/

    //Config bean example
    private DemoController(@Qualifier("swimCoach") Coach theCoach){
        myCoach=theCoach;
    }

    //Setter method for dependency injection
    // @Autowired
    //public void setMyCoach(@Qualifier("tennisCoach") Coach myCoach) {
    //  this.myCoach = myCoach;
    //}

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    //Create new mapping for checking bean scope for singleton and prototype
    @GetMapping("/check")
    public String checkBeanScope(){
        return "Both cricketCoach  point to same bean instance: "+(myCoach==newCoach);
    }
}
