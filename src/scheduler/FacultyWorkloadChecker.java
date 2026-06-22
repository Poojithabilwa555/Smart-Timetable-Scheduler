package scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Faculty;
import model.TimeTableEntry;

public class FacultyWorkloadChecker {

    public boolean exceedsContinuousHours(
            List<TimeTableEntry> timetable,
            Faculty faculty,
            String day,
            int maxContinuousHours) {

        List<Integer> periods = new ArrayList<>();

        for (TimeTableEntry entry : timetable) {

            if (entry.getFaculty().equals(faculty)
                    && entry.getSlot().getDay().equals(day)) {

                periods.add(
                        entry.getSlot().getPeriod()
                );
            }
        }

        Collections.sort(periods);

        int continuousCount = 1;

        for (int i = 1; i < periods.size(); i++) {

            if (periods.get(i)
                    == periods.get(i - 1) + 1) {

                continuousCount++;

                if (continuousCount
                        > maxContinuousHours) {

                    return true;
                }
            } else {

                continuousCount = 1;
            }
        }

        return false;
    }
}
