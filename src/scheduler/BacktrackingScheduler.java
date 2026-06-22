package scheduler;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingScheduler {

    private ConstraintChecker checker;

    private List<TimeTableEntry> timetable;

    public BacktrackingScheduler() {

        checker = new ConstraintChecker();

        timetable = new ArrayList<>();
    }

    public List<TimeTableEntry> getTimetable() {

        return timetable;
    }

    public boolean allocateSingleSlot(
            Faculty faculty,
            Course course,
            Batch batch,
            Classroom room,
            Slot slot) {

        if (!checker.canAllocate(
                timetable,
                faculty,
                batch,
                room,
                course,
                slot)) {

            return false;
        }

        TimeTableEntry entry
                = new TimeTableEntry(
                        faculty,
                        course,
                        batch,
                        room,
                        slot
                );

        timetable.add(entry);

        faculty.addAssignedHour();

        return true;
    }

    public void removeSlot(
            TimeTableEntry entry) {

        timetable.remove(entry);

        entry.getFaculty()
                .removeAssignedHour();
    }

    public void displayTimetable() {

        for (TimeTableEntry entry : timetable) {

            System.out.println(entry);
        }
    }

    public boolean scheduleCourse(
            CourseAssignment assignment,
            Faculty faculty,
            Classroom room) {

        String[] days = {
            "Mon",
            "Tue",
            "Wed",
            "Thu",
            "Fri"
        };

        int allocatedHours = 0;

        int dayIndex = 0;

        while (allocatedHours
                < assignment.getRequiredHours()) {

            String day
                    = days[dayIndex % days.length];

            boolean allocatedToday = false;

            for (int period = 1;
                    period <= 6;
                    period++) {

                Slot slot
                        = new Slot(
                                day,
                                period
                        );

                if (allocateSingleSlot(
                        faculty,
                        assignment.getCourse(),
                        assignment.getBatch(),
                        room,
                        slot)) {

                    allocatedHours++;

                    allocatedToday = true;

                    break;
                }
            }

            if (!allocatedToday) {

                return false;
            }

            dayIndex++;
        }

        return true;
    }

    public boolean scheduleLab(
            CourseAssignment assignment,
            Faculty faculty,
            Classroom labRoom) {

        String[] days = {
            "Mon",
            "Tue",
            "Wed",
            "Thu",
            "Fri"
        };

        for (String day : days) {

            for (int period = 1;
                    period <= 5;
                    period++) {

                Slot slot1
                        = new Slot(day, period);

                Slot slot2
                        = new Slot(day, period + 1);

                boolean first
                        = allocateSingleSlot(
                                faculty,
                                assignment.getCourse(),
                                assignment.getBatch(),
                                labRoom,
                                slot1
                        );

                boolean second
                        = false;

                if (first) {

                    second
                            = allocateSingleSlot(
                                    faculty,
                                    assignment.getCourse(),
                                    assignment.getBatch(),
                                    labRoom,
                                    slot2
                            );
                }

                if (first && second) {

                    return true;
                }
            }
        }

        return false;
    }

}
