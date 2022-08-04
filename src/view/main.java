package view;

import manager.StaffManager;
import model.FullTimeStaff;
import model.HeadOfDepartment;
import model.PartTime;
import model.Staff;

import java.util.List;

public class main {
    static StaffManager object = new StaffManager();
    private static List<Staff> arr = StaffManager.arr;

    static {
//        Nhân viên full
        FullTimeStaff nv1 = new FullTimeStaff(1, "Đinh Băng Băng", "Nữ", 23, true, 26, 2);
        FullTimeStaff nv2 = new FullTimeStaff(2, "Châu Tấn", "Nữ", 24, true, 24, 1);
        FullTimeStaff nv3 = new FullTimeStaff(3, "Dương Mịch", "Nữ", 20, true, 26, 0);
        FullTimeStaff nv4 = new FullTimeStaff(4, "Bùi Công Hưng", "Nam", 30, true, 26, 1.5);
        FullTimeStaff nv5 = new FullTimeStaff(5, "Lê Anh Tuấn", "Nam", 27, true, 25, 2);
    arr.add(nv1);
    arr.add(nv2);
    arr.add(nv3);
    arr.add(nv4);
    arr.add(nv5);

//    Nhân viên part
        PartTime nv6 = new PartTime(6, "Triệu Lệ Dĩnh", "Nữ", 21, false, 100, 10);
        PartTime nv7 = new PartTime(7, "Lưu Diệc Phi", "Nữ", 22, true, 85, 0);
        PartTime nv8 = new PartTime(8, "Đinh La Thăng", "Nam", 21, true, 92, 15);
    arr.add(nv6);
    arr.add(nv7);
    arr.add(nv8);

//    Trưởng phòng
        HeadOfDepartment tp1 = new HeadOfDepartment(9, "Triệu Lộ Tư", "Nữ", 31, true, "Trưởng phòng tư vấn", 600, 2);
        HeadOfDepartment tp2 = new HeadOfDepartment(10, "Cúc Tịch Y", "Nữ", 24, true, "Trưởng phòng nhân sự", 700, 1.5);
        HeadOfDepartment tp3 = new HeadOfDepartment(11, "Định Lệ Nhiệt Ba", "Nữ", 26, true, "Trưởng phòng hành chính", 500, 1);
        arr.add(tp1);
        arr.add(tp2);
        arr.add(tp3);

    }

    public static void main(String[] args) {
//        Check xem arr có đủ thành viên lo
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//    Thêm nhân viên FullTime
//        object.addFullTime();

//      Thêm nhân viên PartTime
//        object.addPartTime();
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }


//      thêm trưởng phòng
//        object.addHeadOfDepartment();
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }

//        sửa các chỉ số
//       object.editInformation(arr, "Châu Tấn");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }

//        xóa nhân viên
//        object.deleteStaff(arr, "Châu Tấn");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }

//        Tìm kiếm nhân viên
//        object.search(arr, "Châu Tấn");

        object.statusDisplay(arr, "trọng");

    }
}
