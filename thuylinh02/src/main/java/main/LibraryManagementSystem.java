package main;

import entities.InMemoryLibraryDataSource;
import entities.InMemoryUserDataSource;
import entities.LibraryManager;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        InMemoryLibraryDataSource libraryDataSource = new InMemoryLibraryDataSource();
        InMemoryUserDataSource userDataSource = new InMemoryUserDataSource();

        LibraryManager libraryManager = new LibraryManager(libraryDataSource, userDataSource);
        displayMenu(libraryManager);
    }

    private static void displayMenu(LibraryManager libraryManager) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Hiển thị danh sách tài liệu.");
            System.out.println("2. Hiển thị danh sách người dùng.");
            System.out.println("3. Tìm kiếm tài liệu.");
            System.out.println("4. Quản lý danh sách tài liệu yêu thích của người dùng.");
            System.out.println("5. Đánh giá tài liệu.");
            System.out.println("6. Mượn tài liệu.");
            System.out.println("7. Trả tài liệu.");
            System.out.println("8. Xuất các loại báo cáo.");
            System.out.println("9. Thoát.");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Đang thoát...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
