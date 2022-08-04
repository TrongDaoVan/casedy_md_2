package model;

public abstract class Staff {
    private int id;
    private String name;
//    giới tính
    private String gender;
    private int age;
    //    trạng thái công việc
    private String status;

    public abstract float totalSalary();

    public Staff() {
    }

    public Staff(int id, String name, String gender, int age, String status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", Tên ='" + name + '\'' +
                ", Giới tính ='" + gender + '\'' +
                ", Tuổi =" + age +
                ", Trạng thái làm việc =" + status +
                '}';
    }
}
