package model;

public class TimeTableEntry {

    private Faculty faculty;
    private Course course;
    private Batch batch;
    private Classroom classroom;
    private Slot slot;

    public TimeTableEntry(Faculty faculty,
            Course course,
            Batch batch,
            Classroom classroom,
            Slot slot) {

        this.faculty = faculty;
        this.course = course;
        this.batch = batch;
        this.classroom = classroom;
        this.slot = slot;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Course getCourse() {
        return course;
    }

    public Batch getBatch() {
        return batch;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public Slot getSlot() {
        return slot;
    }

    @Override
    public String toString() {

        return slot
                + " | "
                + course
                + " | "
                + faculty
                + " | "
                + classroom
                + " | "
                + batch;
    }
}
