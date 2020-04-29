public class Employer extends Man {
    private Department department;
    private String position;
    Man person;

//    public Employer(String name, String surname, String contact) {
//        super(name, surname, contact);
//    }


    public Employer(Department department, String position,  Man person) {
        super();
        this.department = department;
        this.position = position;
        this.person = person;
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
