package model;

public class CourseAssignment {

    private Batch batch;

    private Course course;

    private int requiredHours;

    public CourseAssignment(
            Batch batch,
            Course course,
            int requiredHours) {

        this.batch = batch;
        this.course = course;
        this.requiredHours = requiredHours;
    }

    public Batch getBatch() {
        return batch;
    }

    public Course getCourse() {
        return course;
    }

    public int getRequiredHours() {
        return requiredHours;
    }

    @Override
    public String toString() {

        return batch.getBatchName()
                + " -> "
                + course.getCourseName()
                + " ("
                + requiredHours
                + " hrs)";
    }
}
