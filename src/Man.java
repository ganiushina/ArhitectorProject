import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observer;

public class Man implements Channel  {
    private Notifier notifier;

    private int id;
    private String name;
    private String surname;
    private String surnameTwo;
    private Date birthday;
    private String contact;
    private String education;
    private String classifier;
    private String city;
    private String language;
    private String companyName;
    Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

//    public Man(Notifier notifier) {
//        this.notifier = notifier;
//        notifier.addObserver(this);
//    }

//    public Man() {
//
//    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurnameTwo() {
        return surnameTwo;
    }

    public void setSurnameTwo(String surnameTwo) {
        this.surnameTwo = surnameTwo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public void update(Object o) {
        this.setCompany((Company) o);
    }
}
