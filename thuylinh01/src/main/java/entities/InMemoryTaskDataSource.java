package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryTaskDataSource implements TaskDataSource {
    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        List<ProjectMember> members = new InMemoryMemberDataSource().getAllMembers();

        for (int i = 1; i <= 10; i++) { // 10 Nhiệm vụ đc giao
            ProjectMember assignedTo = members.get(i % 3);
            Date deadline = new Date();

            Task task = new Task("Nhiệm vụ " + i, assignedTo, deadline);
            if (i % 3 == 0) {
                task.markAsCompleted();
            }
            tasks.add(task);
        }
        return tasks;
    }
}
