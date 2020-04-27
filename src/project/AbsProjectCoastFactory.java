package project;

public class AbsProjectCoastFactory implements ProjectFactory {
    @Override
    public ProjectRecruitment getRecruiting() {
        return new ProjectRecruitingImpl();
    }

    @Override
    public ProjectResearch getResearch() {
        return new ProjectResearchImpl();
    }

    @Override
    public ProjectSalarySurvey getSalarySurvey() {
        return new ProjectSalarySurveyImpl();
    }
}
