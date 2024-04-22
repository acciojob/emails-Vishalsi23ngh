package com.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Workspace extends Gmail {

    private List<Meeting> calendar; // Stores all the meetings

    public Workspace(String emailId) {
        super(emailId);
        calendar = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        // Add the meeting to calendar
        calendar.add(meeting);
    }

    public int findMaxMeetings() {
        // Sort meetings by their end times
        Collections.sort(calendar, Comparator.comparing(Meeting::getEndTime));

        int maxMeetings = 0;
        Meeting lastMeeting = null;

        for (Meeting meeting : calendar) {
            // If the meeting starts after the end time of the last meeting attended, attend it
            if (lastMeeting == null || meeting.getStartTime().isAfter(lastMeeting.getEndTime())) {
                maxMeetings++;
                lastMeeting = meeting;
            }
        }

        return maxMeetings;
    }
}
