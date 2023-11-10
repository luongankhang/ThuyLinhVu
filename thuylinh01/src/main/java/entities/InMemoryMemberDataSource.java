package entities;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMemberDataSource implements MemberDataSource {
    @Override
    public List<ProjectMember> getAllMembers() {
        List<ProjectMember> members = new ArrayList<>();
        members.add(new ProjectMember("Thuy Linh 1", true));
        members.add(new ProjectMember("Thuy Linh 2", false));
        members.add(new ProjectMember("Thuy Linh 3", false));
        return members;
    }
}
