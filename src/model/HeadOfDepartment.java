package model;

import java.io.Serializable;

public class HeadOfDepartment extends Staff implements Serializable {
//    Bộ phận nào
    private String part;
//    Lương cứng
    private int hardSalary;
//    Thưởng trách nhiệm
    private double rank;
    private final int CONSTANT = 200;

    @Override
    public float totalSalary() {
        float sum = 0;
        sum = (float) (hardSalary + rank * CONSTANT);
        return sum;
    }

    public HeadOfDepartment() {
    }

    public HeadOfDepartment(int id, String name, String gender, int age, String status, String part, int hardSalary, double rank) {
        super(id, name, gender, age, status);
        this.part = part;
        this.hardSalary = hardSalary;
        this.rank = rank;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public int getCONSTANT() {
        return CONSTANT;
    }

    @Override
    public String toString() {
        return "HeadOfDepartment{" +
                "Tên bộ phận làm việc ='" + part + '\'' +
                ", Lương Cứng =" + hardSalary +
                ", Cấp bậc trách nhiệm =" + rank +
                '}' + super.toString();
    }
}
