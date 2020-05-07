import project.*;

import java.sql.*;
import java.util.Set;

public class Main {


    public static void main(String[] args)  {

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
        manPetya.setId(1);
        manVasya.setId(2);
        ManMapper manMapper = new ManMapper();

        try {
            manMapper.update(manVasya);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            manMapper.insert(manVasya);
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try {
//            Man manFind = manMapper.findById(1);
//            System.out.println("manFind: " +  manFind.getName());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Man manFind1 = manMapper.findById(3);
//            System.out.println("manFind1: " +  manFind1.getName());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
            manMapper.delete(manVasya);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            Man testMan = manMapper.getMan(1);
            System.out.println("testMan: " + testMan.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ManView manView = new ManView();

        ManController manController = new ManController(manVasya, manView);
        manController.updateView();
        manController.setManName("Sidr");
        manController.setManSurname("Vasechkin");
        manController.updateView();


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
