package project;

public abstract class ProjectDecorator implements Project {

    protected Project project;

    public ProjectDecorator(Project project) {
        this.project = project;
    }

    public String getProjectName() {
        return project.getProjectName();
    }
}
