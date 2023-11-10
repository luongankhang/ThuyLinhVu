package entities;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private MemberDataSource memberDataSource;
    private TaskDataSource taskDataSource;

    public ProjectManager(MemberDataSource memberDataSource, TaskDataSource taskDataSource) {
        this.memberDataSource = memberDataSource;
        this.taskDataSource = taskDataSource;
    }

    public List<ProjectMember> getAllMembers() {
        return memberDataSource.getAllMembers();
    }

    public List<Task> getAllTasks() {
        return taskDataSource.getAllTasks();
    }

    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : taskDataSource.getAllTasks()) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : taskDataSource.getAllTasks()) {
            if (!task.isCompleted()) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }
}
