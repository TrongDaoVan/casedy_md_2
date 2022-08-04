package view;

import login.User;
import login.Usermanager;
import manager.StaffManager;
import model.FullTimeStaff;
import model.HeadOfDepartment;
import model.PartTime;
import model.Staff;
import storage.GhiFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static StaffManager object = new StaffManager();
    private static List<Staff> arr = StaffManager.arr;

    static {
//        Nhân viên full
        FullTimeStaff nv1 = new FullTimeStaff(1, "Đinh Băng Băng", "Nữ", 23, "Đang làm", 26, 2);
        FullTimeStaff nv2 = new FullTimeStaff(2, "Châu Tấn", "Nữ", 24, "Đang làm", 24, 1);
        FullTimeStaff nv3 = new FullTimeStaff(3, "Dương Mịch", "Nữ", 20, "Nghỉ Đẻ", 26, 0);
        FullTimeStaff nv4 = new FullTimeStaff(4, "Bùi Công Hưng", "Nam", 30, "Đang làm", 26, 1.5);
        FullTimeStaff nv5 = new FullTimeStaff(5, "Lê Anh Tuấn", "Nam", 27, "Đang làm", 25, 2);
        arr.add(nv1);
        arr.add(nv2);
        arr.add(nv3);
        arr.add(nv4);
        arr.add(nv5);

//    Nhân viên part
        PartTime nv6 = new PartTime(6, "Triệu Lệ Dĩnh", "Nữ", 21, "Đi du lịch", 100, 10);
        PartTime nv7 = new PartTime(7, "Lưu Diệc Phi", "Nữ", 22, "Đang làm", 85, 0);
        PartTime nv8 = new PartTime(8, "Đinh La Thăng", "Nam", 21, "Đang làm", 92, 15);
        arr.add(nv6);
        arr.add(nv7);
        arr.add(nv8);

//    Trưởng phòng
        HeadOfDepartment tp1 = new HeadOfDepartment(9, "Triệu Lộ Tư", "Nữ", 31, "Đang làm", "Trưởng phòng tư vấn", 600, 2);
        HeadOfDepartment tp2 = new HeadOfDepartment(10, "Cúc Tịch Y", "Nữ", 24, "Đang làm", "Trưởng phòng nhân sự", 700, 1.5);
        HeadOfDepartment tp3 = new HeadOfDepartment(11, "Định Lệ Nhiệt Ba", "Nữ", 26, "Đang làm", "Trưởng phòng hành chính kiêm thư kí giám đốc", 1000, 3);
        arr.add(tp1);
        arr.add(tp2);
        arr.add(tp3);

    }

    public static void main(String[] args) {
        Usermanager usermanager = new Usermanager();
        Scanner scannerX = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("1. ĐĂNG KÝ...");
                System.out.println("2. ĐĂNG NHẬP...");
                System.out.println("********************");
                System.out.println("Mời bạn chọn");
                int number = scannerX.nextInt();
                scannerX.nextLine();
                switch (number) {
                    case 1:
                        System.out.println("Nhập tk:");
                        String tk = scannerX.nextLine();
                        System.out.println("Nhập mk");
                        String mk = scannerX.nextLine();
                        Boolean tkLogin = usermanager.validateTk(tk);
                        Boolean mkLogin = usermanager.validateMk(mk);
                        if (tkLogin == true && mkLogin == true) {
                            usermanager.dangKy(tk, mk);
                            System.out.println("Chúc mừng Bạn đã đăng kí thành công");
                        } else {
                            System.out.println("nhập không đúng định dạng");
                        }

                        break;
                    case 2:
                        System.out.println("Nhập tk");
                        String tk1 = scannerX.nextLine();
                        System.out.println("Nhập mk");
                        String mk1 = scannerX.nextLine();
                        User user = usermanager.dangNhap(tk1, mk1);
                        if (user != null) {
                            dangNhapThanhCong();
                        }
                        break;
                }
            }
        } catch (Exception e) {
            System.out.printf("Tính năng bạn chọn chưa phát triển");
        }


    }

    private static void dangNhapThanhCong() {
        while (true) {
            System.out.println("*****-TẬP ĐOÀN ĐÀO THỊ-*****");
            System.out.println("****************************");
            System.out.println("1 - Thông tin toàn bộ nhân viên");
            System.out.println("2 - Lương nhân viên");
            System.out.println("3 - Thêm nhân viên FullTime");
            System.out.println("4 - Thêm nhân viên PartTime");
            System.out.println("5 - Bổ nhiệm trưởng phòng mới");
            System.out.println("6 - Tìm kiếm thông tin nhân viên");
            System.out.println("7 - Hiển thị trạng thái nhân viên");
            System.out.println("8 - Thay đổi trạng thái nhân viên");
            System.out.println("9 - Sửa thông tin nhân viên");
            System.out.println("10 - Đuổi việc nhân viên");
            System.out.println("11 - Ghi file");
            System.out.println("12 - Đọc file");
            System.out.println("****************************************");
            try {
                Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Mời bạn chọn: ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 2:
                        object.sumTotalSalary(arr);
                        break;
                    case 3:
                        object.addFullTime();
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 4:
                        object.addPartTime();
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 5:
                        object.addHeadOfDepartment();
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 6:
                        System.out.println("Mời bạn nhập tên nhân viên muốn tìm");
                        String name = scanner1.nextLine();
                        object.search(arr, name);
                        break;
                    case 7:
                        System.out.println("Mời bạn nhập tên nhân viên muốn kiểm tra trạng thái: ");
                        String name1 = scanner1.nextLine();
                        object.statusDisplay(arr, name1);
                        break;
                    case 8:
                        System.out.println("Mời bạn nhập tên nhân viên muốn thay đổi trạng thái: ");
                        String name2 = scanner1.nextLine();
                        object.changeStatus(arr, name2);
//                    hiểm thị lại nhân viên đó
                        for (int i = 0; i < arr.size(); i++) {
                            if (arr.get(i).getName().equals(name2)) {
                                System.out.println(arr.get(i));
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Mời bạn nhập tên nhân viên muốn sửa: ");
                        String name3 = scanner1.nextLine();
                        object.editInformation(arr, name3);
                        List<String> abc = new ArrayList<>();
                        for (int i = 0; i < arr.size(); i++) {
                            abc.add(arr.get(i).getName());
                        }
                        if (abc.contains(name3)){
                            for (int i = 0; i < arr.size(); i++) {
                                if(arr.get(i).getName().equals(name3)) {
                                    System.out.println(arr.get(i));
                                }
                            }
                        } else {
                            System.out.println("KO có th này");
                        }
                        break;
                    case 10:
                        System.out.println("Mời bạn nhập tên nhân viên muốn đuổi việc: ");
                        String name4 = scanner1.nextLine();
                        object.deleteStaff(arr, name4);
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i));
                        }
                        break;
                    case 11:
                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(arr.get(i).getName());
                        }
                        System.out.println("Chọn tên Nhân viên muốn lưu: ");
                        String namex = scanner1.nextLine();
                        GhiFile obj = new GhiFile();
                        obj.outPut(arr, namex);
                        break;
                    case 12:
                        System.out.println("Dữ liệu trong file");
                        GhiFile obj1 = new GhiFile();
                        obj1.inPut();
                        break;
                    case 0:
                        System.out.printf("Thoát khỏi chương trình");
                        return;
                    default:
                        System.out.println("Nhập ngu qua mời bạn nhập lại");

                }
            } catch (Exception e) {
                System.err.println("Đề nghị bạn nhập đúng theo mẫu");
            }
        }
    }

}