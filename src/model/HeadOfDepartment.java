package model;

public class HeadOfDepartment extends Staff{
//    Bộ phận nào
    private String part;
//    Lương cứng
    private int hardSalary;
//    Thưởng trách nhiệm
    private double rank;
    private final int CONSTANT = 200;

    @Override
    public float totalSalary() {
//        Giá trách nhiệm
        int responsibilityPrice = 200;
        float sum = 0;
        sum = (float) (this.hardSalary + this.rank * responsibilityPrice);
        return sum;
    }

    public HeadOfDepartment() {
    }

    public HeadOfDepartment(int id, String name, String gender, int age, boolean status, String part, int hardSalary, double rank) {
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
                "part='" + part + '\'' +
                ", hardSalary=" + hardSalary +
                ", rank=" + rank +
                '}' + super.toString();
    }
}
