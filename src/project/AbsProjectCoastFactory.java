package project;

public class AbsProjectCoastFactory implements ProjectFactory {

    @Override
    public ProjectRecruitment getRecruiting(double price) {
        return new ProjectRecruitingImpl(price);
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
