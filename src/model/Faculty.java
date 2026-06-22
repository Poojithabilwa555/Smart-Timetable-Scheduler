package model;

import java.util.List;

public class Faculty {

    private int facultyId;
    private String facultyName;

    // Maximum hours faculty can teach in a week
    private int maxWeeklyHours;

    // Example: cannot teach more than 3 continuous periods
    private int maxContinuousHours;

    // Courses handled by faculty
    private List<String> coursesHandled;

    // Tracks allocated hours during timetable generation
    private int assignedHours;

    // Constructor
    public Faculty(
            int facultyId,
            String facultyName,
            int maxWeeklyHours,
            int maxContinuousHours,
            List<String> coursesHandled) {

        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.maxWeeklyHours = maxWeeklyHours;
        this.maxContinuousHours = maxContinuousHours;
        this.coursesHandled = coursesHandled;

        // Initially no hours assigned
        this.assignedHours = 0;
    }

    // Getters
    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getMaxWeeklyHours() {
        return maxWeeklyHours;
    }

    public int getMaxContinuousHours() {
        return maxContinuousHours;
    }

    public List<String> getCoursesHandled() {
        return coursesHandled;
    }

    public int getAssignedHours() {
        return assignedHours;
    }

    // Increase workload when class is assigned
    public void addAssignedHour() {
        assignedHours++;
    }

    // Reduce workload if backtracking removes assignment
    public void removeAssignedHour() {

        if (assignedHours > 0) {
            assignedHours--;
        }
    }

    // Check whether faculty can teach a course
    public boolean canTeach(String courseCode) {

        return coursesHandled.contains(courseCode);
    }

    @Override
    public String toString() {

        return facultyName
                + " (Assigned Hours: "
                + assignedHours + ")";
    }
}
