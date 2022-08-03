package manager;

import model.FullTimeStaff;
import model.HeadOfDepartment;
import model.PartTime;
import model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManager {
    public static List<Staff> arr = new ArrayList<>();

//    Thêm 1 nhân viên FullTime
    public void addFullTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner1.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Trạng thái: ");
        String status1 = scanner1.nextLine();
        boolean status ;
        if ("true".equals(status1)){
            status=true;
        }else {
            status=false;
        }
        System.out.println("Nhập ngày công: ");
        int workingDay = scanner.nextInt();
        System.out.println("Nhập thâm niên: ");
        double seniority = scanner.nextDouble();
        FullTimeStaff add = new FullTimeStaff(id, name, gender, age, status, workingDay, seniority);
        arr.add(add);
    }

//    Thêm một nhân viên PartTime
    public void addPartTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner1.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Trạng thái: ");
        String status1 = scanner1.nextLine();
        boolean status ;
        if ("true".equals(status1)){
            status=true;
        }else {
            status=false;
        }
        System.out.println("Thời gian làm việc: ");
        double time = scanner.nextDouble();
        System.out.println("Tiền vi phạm: ");
        int fines = scanner.nextInt();
        PartTime add = new PartTime(id, name, gender, age, status, time, fines);
        arr.add(add);
    }

//    Thêm trưởng phòng
    public void addHeadOfDepartment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner1.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner1.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Trạng thái: ");
        String status1 = scanner1.nextLine();
        boolean status ;
        if ("true".equals(status1)){
            status=true;
        }else {
            status=false;
        }
        System.out.println("Tên bộ phận bạn muốn bổ nhiệm: ");
        String part = scanner1.nextLine();
        System.out.println("Lương cứng: ");
        int hardSalary = scanner.nextInt();
        System.out.println("Cấp bậc trách nhiệm: ");
        double rank = scanner.nextDouble();
        HeadOfDepartment add = new HeadOfDepartment(id, name, gender, age, status, part, hardSalary, rank);
        arr.add(add);


    }
}
