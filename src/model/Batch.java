package model;

public class Batch {

    private String batchName;
    private int strength;
    private int semester;

    public Batch(String batchName,
            int strength,
            int semester) {

        this.batchName = batchName;
        this.strength = strength;
        this.semester = semester;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getStrength() {
        return strength;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return batchName
                + " (Semester "
                + semester
                + ", Strength "
                + strength
                + ")";
    }
}
