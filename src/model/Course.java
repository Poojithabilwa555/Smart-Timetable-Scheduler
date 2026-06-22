package model;

public class Course {

    private String courseCode;
    private String courseName;
    private int hoursPerWeek;
    private boolean isLab;
    private boolean isMandatory;

    public Course(String courseCode,
            String courseName,
            int hoursPerWeek,
            boolean isLab,
            boolean isMandatory) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.hoursPerWeek = hoursPerWeek;
        this.isLab = isLab;
        this.isMandatory = isMandatory;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public boolean isLab() {
        return isLab;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}
