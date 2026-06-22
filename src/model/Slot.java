package model;

public class Slot {

    private String day;
    private int period;

    public Slot(String day, int period) {
        this.day = day;
        this.period = period;
    }

    public String getDay() {
        return day;
    }

    public int getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return day + " Period-" + period;
    }
}
