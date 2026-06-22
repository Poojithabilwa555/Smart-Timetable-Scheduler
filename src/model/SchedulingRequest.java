package model;

import java.util.List;

public class SchedulingRequest {

    private Batch batch;
    private Course course;

    private List<Faculty> eligibleFaculties;

    private List<Classroom> possibleRooms;

    public SchedulingRequest(
            Batch batch,
            Course course,
            List<Faculty> eligibleFaculties,
            List<Classroom> possibleRooms) {

        this.batch = batch;
        this.course = course;
        this.eligibleFaculties = eligibleFaculties;
        this.possibleRooms = possibleRooms;
    }

    public Batch getBatch() {
        return batch;
    }

    public Course getCourse() {
        return course;
    }

    public List<Faculty> getEligibleFaculties() {
        return eligibleFaculties;
    }

    public List<Classroom> getPossibleRooms() {
        return possibleRooms;
    }
}
