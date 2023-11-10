package entities;

public class ProjectMember {
    private String name;
    private boolean isManager;

    public ProjectMember(String name, boolean isManager) {
        this.name = name;
        this.isManager = isManager;
    }

    public String getName() {
        return name;
    }

    public boolean isManager() {
        return isManager;
    }
}
