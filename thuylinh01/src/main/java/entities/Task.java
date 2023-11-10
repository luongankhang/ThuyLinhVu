package entities;

import java.util.Date;

public class Task {
    private String description;
    private boolean isCompleted;
    private ProjectMember assignedTo;
    private Date deadline;

    public Task(String description, ProjectMember assignedTo, Date deadline) {
        this.description = description;
        this.assignedTo = assignedTo;
        this.deadline = deadline;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public ProjectMember getAssignedTo() {
        return assignedTo;
    }

    public Date getDeadline() {
        return deadline;
    }
}
