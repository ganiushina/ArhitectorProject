import project.ProjectRecruitingImpl;
import project.ProjectRecruitment;

public class Contract {
    private String fileName;
    ProjectRecruitment projectRecruiting;
    Employer employer;

    public Contract(String fileName, ProjectRecruitment projectRecruiting, Employer employer) {
        this.fileName = fileName;
        this.projectRecruiting = projectRecruiting;
        this.employer = employer;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ProjectRecruitment getProjectRecruiting() {
        return projectRecruiting;
    }

    public void setProjectRecruiting(ProjectRecruitment projectRecruiting) {
        this.projectRecruiting = projectRecruiting;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
