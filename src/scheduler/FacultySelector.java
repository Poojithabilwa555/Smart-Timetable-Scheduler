package scheduler;

import model.Faculty;
import model.Course;

import java.util.List;

public class FacultySelector {

    public Faculty selectFaculty(
            Course course,
            List<Faculty> faculties) {

        Faculty bestFaculty = null;

        for (Faculty faculty : faculties) {

            // Check whether faculty can teach course
            if (!faculty.canTeach(
                    course.getCourseCode())) {

                continue;
            }

            // First eligible faculty
            if (bestFaculty == null) {

                bestFaculty = faculty;
            } // Choose faculty with lesser workload
            else if (faculty.getAssignedHours()
                    < bestFaculty.getAssignedHours()) {

                bestFaculty = faculty;
            }
        }

        return bestFaculty;
    }
}
