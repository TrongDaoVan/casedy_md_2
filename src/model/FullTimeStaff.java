package model;

public class FullTimeStaff extends Staff {
//    ngày công
    private int workingDay;
//    Thâm niên
    private double seniority;

    @Override
    public float totalSalary() {
        float sum = 0;
        if (this.workingDay == 26) {
            sum = (float) (this.workingDay * 20 + this.seniority * 40 + 50);
        }
        return sum;
    }

    public FullTimeStaff() {
    }

    public FullTimeStaff(int id, String name, String gender, int age, boolean status, int workingDay, double seniority) {
        super(id, name, gender, age, status);
        this.workingDay = workingDay;
        this.seniority = seniority;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "FullTimeStaff{" +
                "workingDay=" + workingDay +
                ", seniority=" + seniority +
                '}'+ super.toString();
    }
}
