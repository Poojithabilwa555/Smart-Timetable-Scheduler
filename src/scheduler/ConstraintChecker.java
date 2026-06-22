package scheduler;

import java.util.List;
import model.Batch;
import model.Classroom;
import model.Course;
import model.Faculty;
import model.Slot;
import model.TimeTableEntry;

public class ConstraintChecker {

    public boolean hasFacultyClash(
            List<TimeTableEntry> timetable,
            Faculty faculty,
            Slot slot) {

        for (TimeTableEntry entry : timetable) {

            if (entry.getFaculty().equals(faculty)
                    && entry.getSlot().equals(slot)) {

                return true;
            }
        }

        return false;
    }

    public boolean hasRoomClash(
            List<TimeTableEntry> timetable,
            Classroom classroom,
            Slot slot) {

        for (TimeTableEntry entry : timetable) {

            if (entry.getClassroom().equals(classroom)
                    && entry.getSlot().equals(slot)) {

                return true;
            }
        }

        return false;
    }

    public boolean hasBatchClash(
            List<TimeTableEntry> timetable,
            Batch batch,
            Slot slot) {

        for (TimeTableEntry entry : timetable) {

            if (entry.getBatch().equals(batch)
                    && entry.getSlot().equals(slot)) {

                return true;
            }
        }

        return false;
    }

    public boolean hasCapacityViolation(
            Batch batch,
            Classroom classroom) {

        return batch.getStrength()
                > classroom.getCapacity();
    }

    public boolean hasLabViolation(
            Course course,
            Classroom classroom) {

        if (course.isLab() && !classroom.isLab()) {
            return true;
        }

        return false;
    }

    public boolean canAllocate(
            List<TimeTableEntry> timetable,
            Faculty faculty,
            Batch batch,
            Classroom classroom,
            Course course,
            Slot slot) {

        if (hasFacultyClash(timetable, faculty, slot)) {
            return false;
        }

        if (hasRoomClash(timetable, classroom, slot)) {
            return false;
        }

        if (hasBatchClash(timetable, batch, slot)) {
            return false;
        }

        if (hasCapacityViolation(batch, classroom)) {
            return false;
        }

        if (hasLabViolation(course, classroom)) {
            return false;
        }

        return true;
    }
}
