package project;

public class ProjectAddExtraInfo extends ProjectDecorator {

    public ProjectAddExtraInfo(Project project) {
        super(project);
    }

    public String getProjectName(){
        return super.getProjectName() + " " + "New Project info";
    }

}
