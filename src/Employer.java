public class Employer extends Man {
    private Department department;
    private String position;

    public Employer(String name, String surname, String contact) {
        super(name, surname, contact);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
