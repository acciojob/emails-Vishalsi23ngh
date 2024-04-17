package com.driver;

import org.apache.commons.lang3.tuple.Pair;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Workspace extends Gmail{

    private ArrayList<Meeting> calendar; // Stores all the meetings

    public Workspace(String emailId) {
        super(emailId);

        // The inboxCapacity is equal to the maximum value an integer can store.

    }

    public void addMeeting(Meeting meeting){
        //add the meeting to calendar
        this.calendar = new ArrayList<>();
        calendar.add(meeting);



    }

    public int findMaxMeetings(){
        // find the maximum number of meetings you can attend
        // 1. At a particular time, you can be present in at most one meeting
        // 2. If you want to attend a meeting, you must join it at its start time and leave at end time.
        // Example: If a meeting ends at 10:00 am, you cannot attend another meeting starting at 10:00 am
        ArrayList<LocalTime> endtime = new ArrayList<>();
        for(Meeting meeting: calendar){
            endtime.add(meeting.getEndTime(endtime));
        }

        Collections.sort(endtime);
        int count = 0;
        LocalTime temp = LocalTime.ofSecondOfDay(0);
        for(LocalTime key : endtime){
            if (temp .compareTo(key) <= 0){
                count++;
                temp = key;
            }
        }
        return count;
    }
}
