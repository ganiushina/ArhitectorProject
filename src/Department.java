import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;

   // private Set employees = new HashSet();

    private Set<Employer> employees = new HashSet();

    public Department(String n){
        name = n;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void addEmployee(Employer newEmployee){
        employees.add(newEmployee);
        newEmployee.setDepartment(this);
    }
    public Set getEmployees(){
        return employees;
    }
    public void deleteEmployee(Employer e){
        employees.remove(e);
    }


}
