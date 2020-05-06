package project;

public class ProjectRecruitingImpl implements ProjectRecruitment {
    private double price;

    public ProjectRecruitingImpl(double price) {
        this.price = price;
    }

    @Override
    public double getProjectRecruitmentCoast(double price) {
        return price;
    }
}
