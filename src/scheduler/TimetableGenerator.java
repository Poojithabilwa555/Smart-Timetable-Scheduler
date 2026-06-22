package scheduler;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class TimetableGenerator {

    private List<TimeTableEntry> timetable;

    private ConstraintChecker checker;

    public TimetableGenerator() {

        timetable = new ArrayList<>();

        checker = new ConstraintChecker();
    }

    public List<TimeTableEntry> getTimetable() {

        return timetable;
    }

    public boolean generateSingleLecture(
            Faculty faculty,
            Course course,
            Batch batch,
            Classroom classroom,
            Slot slot) {

        if (!checker.canAllocate(
                timetable,
                faculty,
                batch,
                classroom,
                course,
                slot)) {

            return false;
        }

        TimeTableEntry entry
                = new TimeTableEntry(
                        faculty,
                        course,
                        batch,
                        classroom,
                        slot
                );

        timetable.add(entry);

        return true;
    }

    public void displayTimetable() {

        for (TimeTableEntry entry : timetable) {

            System.out.println(entry);
        }
    }
}
