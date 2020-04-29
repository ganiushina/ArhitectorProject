import project.*;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Roga&Copyta", "Moscow", "4567");
        Man manVasya = new Builder().withName("Vasya").withSurname("Pupkin").withCity("Samara").withCompany(company).build();
        Man manPetya = new Builder().withName("Petya").withSurname("Vasechkin").withContact("123").withEducation("hiht").build();
        Department department = new Department("IT");
        company.addObserver(manVasya);
        Employer employerVasya = new Employer(department, "dvornik", manVasya);
        Employer employerPetya = new Employer(department, "storoj", manPetya);
        department.addEmployee(employerVasya);
        department.addEmployee(employerPetya);

        company.setName("lalala");
        System.out.println(manPetya.getCompanyName());
        System.out.println(manVasya.getCompany().getName());

        ProjectFactory projectFactory;

        String projectType  = "recruitment";
        if (projectType.equals("recruitment")){
            projectFactory = new AbsProjectCoastFactory();
        }
        else {
            projectFactory = new NewProjectFactory();
        }

        ProjectRecruitment projectRecruiting = projectFactory.getRecruiting(2000);
        System.out.println(projectRecruiting.getProjectRecruitmentCoast(300));

        Contract contract = new Contract("contract1", projectRecruiting, employerPetya);

        Set<Employer> set = department.getEmployees();

        for (Employer s : set) {
            System.out.println(s.person.getName());
        }

        System.out.println(contract.getFileName());
        System.out.println( employerPetya.getDepartment().getName());

        Project newProject = new NewProject();
        Project extraProject = new ProjectAddExtraInfo(new UnknownProject());
        System.out.println(extraProject.getProjectName());
        System.out.println(newProject.getProjectName());
    }
}
