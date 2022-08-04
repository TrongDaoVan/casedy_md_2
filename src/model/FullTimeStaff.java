package model;

public class FullTimeStaff extends Staff {
//    ngày công
    private int workingDay;
//    Thâm niên
    private double seniority;

    @Override
    public float totalSalary() {
//        Thưởng chuyên cần
        int attendanceBonus = 50;
//        tiền thưởng thâm niên/năm
        int moneyLevel = 40;
//        Tiền lương tính theo ngày
        int salaryInADay = 20;
        float sum = 0;
        if (workingDay > 22) {
            sum = (float) (workingDay * salaryInADay + seniority * moneyLevel + attendanceBonus);
        } else {
            sum = (float) (workingDay * salaryInADay + seniority * moneyLevel);
        }
        return sum;
    }

    public FullTimeStaff() {
    }

    public FullTimeStaff(int id, String name, String gender, int age, String status, int workingDay, double seniority) {
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
                "Ngày Công =" + workingDay +
                ", Thâm niên =" + seniority +
                '}'+ super.toString();
    }
}
