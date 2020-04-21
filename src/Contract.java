public class Contract {
    private String fileName;
    Project project;
    Employer employer;

    public Contract(String fileName, Project project, Employer employer) {
        this.fileName = fileName;
        this.project = project;
        this.employer = employer;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
