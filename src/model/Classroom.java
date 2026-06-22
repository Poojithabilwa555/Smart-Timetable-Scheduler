package model;

public class Classroom {

    private String roomId;
    private int capacity;
    private boolean isLab;

    public Classroom(String roomId,
            int capacity,
            boolean isLab) {

        this.roomId = roomId;
        this.capacity = capacity;
        this.isLab = isLab;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isLab() {
        return isLab;
    }

    @Override
    public String toString() {

        return roomId
                + " (Capacity "
                + capacity
                + ", Lab: "
                + isLab
                + ")";
    }
}
