package model;

public class PartTime extends Staff{
//    Thời gian làm việc
    private double time;
    // tiền phạt vi phạm
    private int fines;

    @Override
    public float totalSalary() {
//        Lương tính theo giờ
        int hourlySalary = 2;
        float sum = 0;
        sum = (float) (this.time * hourlySalary - this.fines);
        return sum;
    }

    public PartTime() {
    }

    public PartTime(int id, String name, String gender, int age, boolean status, double time, int fines) {
        super(id, name, gender, age, status);
        this.time = time;
        this.fines = fines;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getFines(int fines) {
        return this.fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "time=" + time +
                ", fines=" + fines +
                '}' + super.toString();
    }
}
