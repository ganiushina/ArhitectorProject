public class Project {
    private int id;
    private String name;
    Company company;
    Employer employer;

    public Project(String name, Company company, Employer employer) {
        this.name = name;
        this.company = company;
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
