public class Classroom {
    private String roomNumber;
    private int size; 

    public String getRoomNumber() {
        return roomNumber;
    }
    public int getSize() {
        return size;
    }
    public Classroom(String roomNumber, int size) {
        this.roomNumber = roomNumber;
        this.size = size;
    }
    public Classroom() {
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Classroom [roomNumber=" + roomNumber + ", size=" + size + "]";
    }
    
}
