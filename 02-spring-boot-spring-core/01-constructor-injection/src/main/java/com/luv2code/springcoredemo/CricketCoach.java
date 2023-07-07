package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
//marks the class as a spring bean
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 25 minutes";
    }
}
