package scheduler;

import model.Course;

import java.util.ArrayList;
import java.util.List;

public class PriorityScheduler {

    public List<Course> sortCourses(
            List<Course> courses) {

        List<Course> sorted
                = new ArrayList<>(courses);

        sorted.sort(
                (c1, c2)
                -> Integer.compare(
                        getPriority(c1),
                        getPriority(c2)
                )
        );

        return sorted;
    }

    private int getPriority(
            Course course) {

        String name
                = course.getCourseName()
                        .toLowerCase();

        if (name.contains("professional elective")) {
            return 1;
        }

        if (name.contains("open elective")) {
            return 2;
        }

        if (course.isLab()) {
            return 3;
        }

        return 4;
    }
}
