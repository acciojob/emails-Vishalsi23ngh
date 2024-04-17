package com.driver;

import java.time.LocalTime;
import java.util.ArrayList;

public class Meeting {
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public  LocalTime getEndTime(ArrayList<LocalTime> endtime){
        return  endTime;
    }
}
