import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Employer employerVasya = new Employer("Vasya", "Pupkin", "'123");
        Employer employerPetya = new Employer("Petya", "Pupkin", "'123");
        Department department = new Department("IT");
        department.addEmployee(employerVasya);
        department.addEmployee(employerPetya);
        Company company = new Company("Roga&Copyta", "Moscow", "4567");
        Project project = new Project("NewVasyki", company, employerVasya);
        Contract contract = new Contract("contract1", project, employerPetya);

        Set<Employer> set = department.getEmployees();

        for (Employer s : set) {
            System.out.println(s.getName());
        }

        System.out.println(contract.getFileName());
        System.out.println( employerPetya.getDepartment().getName());


    }
}
