package project;

public class NewProjectFactory implements ProjectFactory {
    @Override
    public ProjectRecruitment getRecruiting() {
        return new NewProjectRecruitment();
    }

    @Override
    public ProjectResearch getResearch() {
        return new NewProjectResearch();
    }

    @Override
    public ProjectSalarySurvey getSalarySurvey() {
        return new NewProjectSalarySurvey();
    }
}
