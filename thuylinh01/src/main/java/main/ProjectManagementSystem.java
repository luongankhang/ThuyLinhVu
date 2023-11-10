package main;

import entities.*;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class ProjectManagementSystem {
    public static void main(String[] args) {
        MemberDataSource memberDataSource = new InMemoryMemberDataSource();
        TaskDataSource taskDataSource = new InMemoryTaskDataSource();

        ProjectManager projectManager = new ProjectManager(memberDataSource, taskDataSource);
        displayMenu(projectManager);
    }

    private static void displayMenu(ProjectManager projectManager) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Hiển thị các nhiệm vụ đã hoàn thành.");
            System.out.println("2. Hiển thị các nhiệm vụ chưa hoàn thành.");
            System.out.println("3. Hiển thị tất cả nhiệm vụ.");
            System.out.println("4. Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayTasks(projectManager.getCompletedTasks());
                    break;
                case 2:
                    displayTasks(projectManager.getIncompleteTasks());
                    break;
                case 3:
                    displayTasks(projectManager.getAllTasks());
                    break;
                case 4:
                    System.out.println("Đang thoát...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void displayTasks(List<Task> tasks) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (Task task : tasks) {
            String status = task.isCompleted() ? "Hoàn thành" : "Chưa hoàn thiện";
            String assignedTo = task.getAssignedTo().getName();
            String deadline = dateFormat.format(task.getDeadline());
            System.out.println("Mô tả: " + task.getDescription() +
                    ", Trạng thái: " + status + ", Phân công: "
                    + assignedTo + ", Thời hạn: " + deadline);
        }
    }
}
