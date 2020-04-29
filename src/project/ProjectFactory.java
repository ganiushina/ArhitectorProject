package project;

public interface ProjectFactory {

        ProjectRecruitment getRecruiting(double price);
        ProjectResearch getResearch();
        ProjectSalarySurvey getSalarySurvey();
}
