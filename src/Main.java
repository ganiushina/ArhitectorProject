import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Man manVasya = new Man.Builder().withName("Vasya").withSurname("Pupkin").withCity("Samara").build();
        Man manPetya = new Man.Builder().withName("Petya").withSurname("Vasechkin").withContact("123").withEducation("hiht").build();
        Department department = new Department("IT");
        Employer employerVasya = new Employer(department, "dvornik", manVasya);
        Employer employerPetya = new Employer(department, "storoj", manPetya);
        department.addEmployee(employerVasya);
        department.addEmployee(employerPetya);
        Company company = new Company("Roga&Copyta", "Moscow", "4567");
        Project project = new Project("NewVasyki", company, employerVasya);
        Contract contract = new Contract("contract1", project, employerPetya);



        Set<Employer> set = department.getEmployees();

        for (Employer s : set) {
            System.out.println(s.person.getName());
        }

        System.out.println(contract.getFileName());
        System.out.println( employerPetya.getDepartment().getName());


    }
}
