
import java.util.Arrays;
import model.*;
import scheduler.BacktrackingScheduler;

public class Main {

    public static void main(String[] args) {

        Faculty faculty
                = new Faculty(
                        101,
                        "Dr Sharma",
                        18,
                        3,
                        Arrays.asList(
                                "CSE351"
                        )
                );

        Course osLab
                = new Course(
                        "CSE351",
                        "Operating Systems Lab",
                        2,
                        true,
                        true
                );

        Batch batch
                = new Batch(
                        "CSE-5A",
                        75,
                        5
                );

        Classroom lab
                = new Classroom(
                        "LAB-1",
                        80,
                        true
                );

        CourseAssignment labAssignment
                = new CourseAssignment(
                        batch,
                        osLab,
                        2
                );

        BacktrackingScheduler scheduler
                = new BacktrackingScheduler();

        boolean success
                = scheduler.scheduleLab(
                        labAssignment,
                        faculty,
                        lab
                );

        System.out.println(
                "Lab Scheduled: "
                + success
        );

        System.out.println();

        scheduler.displayTimetable();
    }
}
