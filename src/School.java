import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person member) {
        members.add(member);
    }
    public List<Person> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("School members:\n");
        for (Person member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}
